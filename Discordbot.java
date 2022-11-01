package me.joshuacasuga;
import commands.BotCommands;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import javax.security.auth.login.LoginException;

public class Discordbot
{
    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA jda = JDABuilder.createDefault("MY API KEY")
                .setActivity(Activity.playing("Bot in Progress."))
                .addEventListeners(new BotCommands())
                .build().awaitReady();

        Guild guild =  jda.getGuildById("1035308066134048798"); //personal server
        Guild guild1 = jda.getGuildById("420369920849870858"); //Mitty Bois
        Guild guild2 = jda.getGuildById("898766670967996416"); //EZ PZ

        if (guild!=null)
        {
            guild.upsertCommand("ping", "Ping Pong!").queue();
            guild.upsertCommand("goat", "Who is the goat?").queue();
            guild.upsertCommand("batumson", "Who is Nicolas Batum's son?").queue();
            guild.upsertCommand("tatumson", "Who is Jayson Tatum's son?").queue();
            guild.upsertCommand("coinflip", "A coinflip.").queue();
            guild.upsertCommand("favplayer", "Your favorite player.")
                    .addOption(OptionType.STRING, "playername", "The name of your favorite player", true)
                    .queue();
            guild.upsertCommand("sum", "Gets the sum of two numbers.")
                    .addOption(OptionType.INTEGER, "operand1", "The first number", true)
                    .addOption(OptionType.INTEGER, "operand2", "The second number", true)
                    .queue();
        }
        if (guild1!=null)
        {
            guild1.upsertCommand("ping", "Ping Pong!").queue();
            guild1.upsertCommand("goat", "Who is the goat?").queue();
            guild1.upsertCommand("batumson", "Who is Nicolas Batum's son?").queue();
            guild1.upsertCommand("tatumson", "Who is Jayson Tatum's son?").queue();
            guild1.upsertCommand("coinflip", "A coinflip.").queue();
            guild1.upsertCommand("favplayer", "Your favorite player.")
                    .addOption(OptionType.STRING, "playername", "The name of your favorite player", true)
                    .queue();
            guild1.upsertCommand("sum", "Gets the sum of two numbers.")
                    .addOption(OptionType.INTEGER, "operand1", "The first number", true)
                    .addOption(OptionType.INTEGER, "operand2", "The second number", true)
                    .queue();
        }
        if (guild2!=null)
        {
            guild2.upsertCommand("ping", "Ping Pong!").queue();
            guild2.upsertCommand("goat", "Who is the goat?").queue();
            guild2.upsertCommand("batumson", "Who is Nicolas Batum's son?").queue();
            guild2.upsertCommand("tatumson", "Who is Jayson Tatum's son?").queue();
            guild2.upsertCommand("coinflip", "A coinflip.").queue();
            guild2.upsertCommand("favplayer", "Your favorite player.")
                    .addOption(OptionType.STRING, "playername", "The name of your favorite player", true)
                    .queue();
            guild2.upsertCommand("sum", "Gets the sum of two numbers.")
                    .addOption(OptionType.INTEGER, "operand1", "The first number", true)
                    .addOption(OptionType.INTEGER, "operand2", "The second number", true)
                    .queue();
        }

    }
}
