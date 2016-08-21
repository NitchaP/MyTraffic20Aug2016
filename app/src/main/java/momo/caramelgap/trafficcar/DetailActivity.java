package momo.caramelgap.trafficcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

        //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget  เรียกใช้
        //ตัวแปร = ประเภท fiV(R.id.ชื่อไอเทม
        titleTextView = (TextView) findViewById(R.id.textView6);
        detailTextView = (TextView) findViewById(R.id.textView7);
        imageView = (ImageView) findViewById(R.id.imageView2);
        button = (Button) findViewById(R.id.button2);

        //รับค่า Receive From Intent
        String strTitle = getIntent().getStringExtra("Title");
        //ถ้ารับไม่ได้ ให้เรียก traffic
        int intImage = getIntent().getIntExtra("icon", R.drawable.traffic_01);
        String strDetail = getIntent().getStringExtra("Detail");

        //Show View แสดงรายการ
        titleTextView.setText(strTitle);
        imageView.setImageResource(intImage);
        detailTextView.setText(strDetail);


    }   //Main Method
}   //Main class
