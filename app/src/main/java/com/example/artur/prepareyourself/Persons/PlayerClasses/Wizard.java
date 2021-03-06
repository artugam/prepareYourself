package com.example.artur.prepareyourself.Persons.PlayerClasses;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.example.artur.prepareyourself.Persons.PersonBase;
import com.example.artur.prepareyourself.R;
import com.example.artur.prepareyourself.Skills.Spells.FireBall;
import com.example.artur.prepareyourself.Skills.Spells.Freeze;


public class Wizard extends PersonBase {

    private final static String DEFAULT_NAME = "Wizard";
    private final static int DEFAULT_HP = 100;
    private final static int DEFAULT_ENERGY = 4;

    public Wizard(String imie, int hp, int energy) {
        super(imie, hp, energy);
    }

    public Wizard(String imie) {
        super(imie, DEFAULT_HP, DEFAULT_ENERGY);
    }

    public Wizard() {
        super(DEFAULT_NAME, DEFAULT_HP, DEFAULT_ENERGY);
    }

    public void assignSkills()
    {
        this.addSkill(new FireBall(2, 2));
        this.addSkill(new Freeze(37, 3));
    }

    public Drawable getThemeImage(Resources resources)
    {
        return resources.getDrawable( R.drawable.wizard, null);
    }


    @Override
    public String toString() {
        return "Wizard{" +
                "imie='" + imie + '\'' +
                ", hp=" + hp +
                ", energy=" + energy +
                '}';
    }
}
