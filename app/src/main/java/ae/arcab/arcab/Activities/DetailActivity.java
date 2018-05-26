package ae.arcab.arcab.Activities;

import android.app.DatePickerDialog;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import ae.arcab.arcab.Utils.FontUtil;
import ae.arcab.arcab.R;

public class DetailActivity extends AppCompatActivity {

    private Context mContext = this;
    private static final String HEADING = "And ?";
    private static final String SUBHEADING = "Date of Birth";
    private static final String SUBHEADING2 = "GENDER";
    private static final String TEXT = "You must be at least 18 years old for arcab. We don’t share this with anyone.";
    private EditText editText;
    private Calendar myCalendar;
    private DatePickerDialog.OnDateSetListener date;
    private TextView textView5, textView6, textView7, textView8, textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        init();
    }

    private void init(){

        myCalendar = Calendar.getInstance();

        TextView textView = (TextView) findViewById(R.id.text_view_detail_one);
        textView.setText(HEADING);
        textView.setTextSize(30);
        textView.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        editText = (EditText) findViewById(R.id.data_picker_detail);
        editText.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));
        editText.setTextSize(20);
        editText.setTypeface(FontUtil.getColfaxMedium(mContext));


        date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }
        };

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(DetailActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });

        TextView textView2 = (TextView) findViewById(R.id.text_view_detail_second);
        textView2.setText(SUBHEADING);
        textView2.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView2.setTextSize(14);
        textView2.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));
        textView2.setAllCaps(true);

        TextView textView3 = (TextView) findViewById(R.id.text_view_detail_third);
        textView3.setText(TEXT);
        textView3.setTypeface(FontUtil.getColfaxRegular(mContext));
        textView3.setTextSize(16);
        textView3.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        TextView textView4 = (TextView) findViewById(R.id.text_view_detail_four);
        textView4.setText(SUBHEADING2);
        textView4.setTextSize(14);
        textView4.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView4.setTextColor(ContextCompat.getColor(this, R.color.colorTextBlack));
        textView4.setAllCaps(true);

        textView5 = (TextView) findViewById(R.id.text_view_detail_female);
        textView5.setText("Female");
        textView5.setTextSize(20);
        textView5.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView5.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        textView6 = (TextView) findViewById(R.id.text_view_detail_slash1);
        textView6.setText("/");
        textView6.setTextSize(20);
        textView6.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView6.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        textView7 = (TextView) findViewById(R.id.text_view_detail_male);
        textView7.setText("Male");
        textView7.setTextSize(20);
        textView7.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView7.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        textView8 = (TextView) findViewById(R.id.text_view_detail_slash2);
        textView8.setText("/");
        textView8.setTextSize(20);
        textView8.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView8.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

        textView9 = (TextView) findViewById(R.id.text_view_detail_unspecified);
        textView9.setText("Other");
        textView9.setTextSize(20);
        textView9.setTypeface(FontUtil.getColfaxMedium(mContext));
        textView9.setTextColor(ContextCompat.getColor(mContext, R.color.colorTextBlack));

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

    private void updateLabel() {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(myFormat, Locale.US);

        editText.setText(simpleDateFormat.format(myCalendar.getTime()));
    }
}
