package com.rental_apps.android.rental_apps.helper;

import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;

/**
 * Created by Aditya NA on 11/12/2018.
 */

public class DrawableColor {

    public static Drawable setColor(Drawable drawable, int color) {
        drawable = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawable, color);
        return drawable;
    }

}
