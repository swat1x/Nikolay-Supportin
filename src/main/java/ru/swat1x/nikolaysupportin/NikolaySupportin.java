package ru.swat1x.nikolaysupportin;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NikolaySupportin {

    @Getter
    private static NikolaySupportin instance;

    JDA jda;

    public NikolaySupportin(String token) {
        this.jda = JDABuilder.createDefault(token)
                .build();

        registerListeners(jda);
    }

    private void registerListeners(JDA jda) {

    }

}
