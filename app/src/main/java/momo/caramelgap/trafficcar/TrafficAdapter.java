package momo.caramelgap.trafficcar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Woramate on 21/8/2559.
 */
//extends BaseAdapter สร้างตัวสือทอด
public class TrafficAdapter extends BaseAdapter{

    //Explicit ประการตัวแปร
    //context คือการสื่อสาร object to object
    private Context context;
    private int[] iconInts;
    //ประกาศตัวแปรตัวอัีักรpr
    private String[] titleStrings,detailStrings,stockStrings, priceStrings;

    //กำหนดค่าให้กับตัวแปร
    public TrafficAdapter(Context context, int[] iconInts, String[] titleStrings, String[] detailStrings, String[] stockStrings, String[] priceStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.stockStrings = stockStrings;
        this.priceStrings = priceStrings;
    }

    @Override
    //นับมี listview กี่อัน ให้นับเอง iconInts.length
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //Layout เสมือน    เปิด layoutเสมือน "context.getSystemService"  Alt+Enter
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //พาหนะตัวนำพา View ctrl spe
        View view1 = layoutInflater.inflate(R.layout.traffic_listview, ViewGroup, false);

        //Bind Widget
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);

        // TextV (Ctrl+sp)title (Ctrl+sp) = view1.findViewById((R.id.textView2)); (Alt+Enter)(C+S+E)

        TextView titleTextView = (TextView) view1.findViewById((R.id.textView2));
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        TextView stockTextView = (TextView) view1.findViewById((R.id.textView4));
        TextView priceTextView = (TextView) view1.findViewById(R.id.textView5);

        //Show View  วนลูปเอง
        iconImageView.setImageResource(iconInts[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);
        stockTextView.setText(stockStrings[i]);
        priceTextView.setText(priceStrings[i]);

        return view1;
    }
}   //Main class
