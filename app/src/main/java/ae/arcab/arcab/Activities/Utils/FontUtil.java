package ae.arcab.arcab.Activities.Utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;

import java.lang.reflect.Type;

public class FontUtil {

    public static Typeface getColfaxLight(Context context){
        return Typeface.createFromAsset(context.getAssets(), "fonts/Colfax-Light.otf");
    }

    public static Typeface getColfaxMedium(Context context){
        return Typeface.createFromAsset(context.getAssets(), "fonts/Colfax-Medium.otf");
    }

    public static Typeface getColfaxRegular(Context context){
        return Typeface.createFromAsset(context.getAssets(), "fonts/Colfax-Regular.otf");
    }

    public static Typeface getColfaxThin(Context context){
        return Typeface.createFromAsset(context.getAssets(), "fonts/Colfax-Thin.otf");
    }

}
