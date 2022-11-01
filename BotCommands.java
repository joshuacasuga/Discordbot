package commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.utils.FileUpload;
import java.io.File;
import java.util.Random;

public class BotCommands extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if(event.getName().equals("ping")){
            event.reply("Pong!").queue();
        }

        if(event.getName().equals("goat")){
            event.reply("Nicolas Batum is the goat.").queue();
        }

        if(event.getName().equals("batumson")){
            //event.reply("Nicolas Batum's son is Grant Williams.").queue();
            FileUpload file = FileUpload.fromData(new File("C:/Users/jomat" +
                    "/Desktop/Botphotos/batumxgrant.jpg"));
            event.replyFiles(file).queue();
        }

        if(event.getName().equals("tatumson")){
            FileUpload file = FileUpload.fromData(new File("C:/Users/jomat" +
                    "/Desktop/Botphotos/lebum.jpg"));
            event.replyFiles(file).queue();
        }

        if(event.getName().equals("coinflip")){
            int min = 1;
            int max = 100;
            Random rand = new Random();
            int randomNum = rand.nextInt((max-min) + 1) + min;
            if(randomNum >= 1 && randomNum <= 50)
            {
                event.reply("Heads!").queue();
            }
            else
            {
                event.reply("Tails!").queue();
            }
        }

        if(event.getName().equals("favplayer")){
            OptionMapping option = event.getOption("playername");
            if(option == null){
                event.reply("A player name was not provided").queue();
                return;
            }
            String player = option.getAsString();
            event.reply("Your favorite player is: " + player).queue();
        }

        if(event.getName().equals("sum"))
        {
            OptionMapping operand1 = event.getOption("operand1");
            OptionMapping operand2 = event.getOption("operand2");
            if(operand1 == null || operand2 == null){
                event.reply("There is a missing operand.").queue();
                return;
            }
            int sum = operand1.getAsInt() + operand2.getAsInt();
            event.reply("The sum is: " + sum).queue();
        }

    }

}
