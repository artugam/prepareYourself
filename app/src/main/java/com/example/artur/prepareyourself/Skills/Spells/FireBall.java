package com.example.artur.prepareyourself.Skills.Spells;

import android.content.Context;
import android.media.MediaPlayer;

import com.example.artur.prepareyourself.R;
import com.example.artur.prepareyourself.Skills.SkillBase;

public class FireBall extends SkillBase {

    private final static int DAMAGE_MULTIPLER = 2;

    protected static String name = "FireBall";

    public FireBall(int damage, int energy, int mana) {

        super(name, damage * DAMAGE_MULTIPLER, energy, mana);
    }


    public int getMusic()
    {
        return R.raw.spells_fireball;
    }


    @Override
    public void action(Context appContext) {

        MediaPlayer spellMusic = MediaPlayer.create(appContext, getMusic());
        spellMusic.start();
    }

    @Override
    public String toString() {
        return "FireBall{" +
                "damage=" + damage +
                ", energy=" + energy +
                ", mana=" + mana +
                ", name='" + name + '\'' +
                '}';
    }
}