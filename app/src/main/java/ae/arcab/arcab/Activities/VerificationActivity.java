package ae.arcab.arcab.Activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import ae.arcab.arcab.R;

public class VerificationActivity extends AppCompatActivity {

    private static final String HEADING = "Verify";
    private static final String CODE = "code";
    private static final String EMN = "edit mobile number";
    private static final String TEXT = "We sent you an SMS to +971 50 972 7272 to continue creating your new account.";
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        init();
    }

    private void init(){

        int fontSize = 30;
        int fontSize2 = 14;
        int fontSize3 = 16;

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Colfax-Medium.otf");
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "fonts/Colfax-Regular.otf");

        TextView textView = (TextView) findViewById(R.id.text_view_verification);
        textView.setText(HEADING);
        textView.setTextSize(fontSize);
        textView.setTypeface(typeface);
        textView.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        EditText editText = (EditText) findViewById(R.id.et_verification_one);
        EditText editText1 = (EditText) findViewById(R.id.et_verification_two);
        EditText editText2 = (EditText) findViewById(R.id.et_verification_three);
        EditText editText3 = (EditText) findViewById(R.id.et_verification_four);
        EditText editText4 = (EditText) findViewById(R.id.et_verification_five);

        TextView textView1 = (TextView) findViewById(R.id.text_view_verification_second);
        textView1.setText(CODE);
        textView1.setTextSize(fontSize2);
        textView1.setTypeface(typeface);
        textView1.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));
        textView1.setAllCaps(true);

        TextView textView2 = (TextView) findViewById(R.id.text_view_verification_thrid);
        textView2.setText(EMN);
        textView2.setTextSize(fontSize2);
        textView2.setTypeface(typeface);
        textView2.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextPink));
        textView2.setAllCaps(true);


        TextView textView3 = (TextView) findViewById(R.id.text_view_verification_four);
        textView3.setText(TEXT);
        textView3.setTextSize(fontSize3);
        textView3.setTypeface(typeface1);
        textView3.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        ImageButton imageButton = (ImageButton) findViewById(R.id.img_btn_back_verify);
        imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));
        imageButton.setBackgroundColor(ContextCompat.getColor(mContext,R.color.colorText));

        Button button = (Button) findViewById(R.id.btn_next_screen_verify);
        button.setText("Next");
        button.setAllCaps(false);
        button.setTextColor(ContextCompat.getColor(mContext,R.color.colorText));
        button.setTypeface(typeface);
        button.setTextSize(fontSize3);
        button.setStateListAnimator(null);

    }

    public void onBackClickVerifiy(View view){
        startActivity(new Intent(VerificationActivity.this, ContactNumberActivity.class));
    }

    public void onNextClickVerifiy(View view){
        startActivity(new Intent(VerificationActivity.this, NameActivity.class));
    }
}
