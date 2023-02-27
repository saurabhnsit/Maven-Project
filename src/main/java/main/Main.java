package main;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import static main.Config.token;

public class Main {
    public JDABuilder builder;
    public JDA shardMan;
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        builder = JDABuilder.createDefault(token);

        shardMan = builder.build();
        pintln();
    }

    private void pintln(){
        System.out.println("!-Bot ist starting-!");
        System.out.println(shardMan.getAccountType().name());
    }
}
