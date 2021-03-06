package ae.arcab.arcab.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import ae.arcab.arcab.Utils.FontUtil;
import ae.arcab.arcab.R;

public class PasswordAcitivity extends AppCompatActivity {

    private static final String HEADING = "Set Your Password";
    private static final String SUBHEADING = "Password";
    private static final String TEXT = "Your password must include at least eight characters and one symbol.";
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_acitivity);
        init();
    }

    public void init(){
        TextView textView = (TextView) findViewById(R.id.text_view_password_one);
        textView.setText(HEADING);
        textView.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView.setTextSize(30);
        textView.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));


        TextView textView2 = (TextView) findViewById(R.id.text_view_password_second);
        textView2.setText(SUBHEADING);
        textView2.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView2.setTextSize(14);
        textView2.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));
        textView2.setAllCaps(true);

        TextView textView3 = (TextView) findViewById(R.id.text_view_password_third);
        textView3.setText(TEXT);
        textView3.setTypeface(FontUtil.getColfaxRegular(mContext));
        textView3.setTextSize(16);
        textView3.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        ImageButton imageButton = (ImageButton) findViewById(R.id.img_btn_back);
        imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));
        imageButton.setBackgroundColor(ContextCompat.getColor(mContext,R.color.colorText));

        Button button = (Button) findViewById(R.id.btn_next_screen);
        button.setText("Next");
        button.setAllCaps(false);
        button.setTextColor(ContextCompat.getColor(mContext,R.color.colorText));
        button.setTypeface(FontUtil.getColfaxMedium(mContext));
        button.setTextSize(18);
        button.setStateListAnimator(null);

    }

    public void onBackClickPassword(View view){
        startActivity(new Intent(PasswordAcitivity.this, EmailActivity.class));
    }

    public void onNextClickPassword(View view){
        startActivity(new Intent(PasswordAcitivity.this, DetailActivity.class));
    }
}
