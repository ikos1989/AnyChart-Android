package com.anychart.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Cartesian;
import com.anychart.anychart.DistinctColors;
import com.anychart.anychart.Fill;
import com.anychart.anychart.Pie;
import com.anychart.anychart.SolidFill;
import com.anychart.anychart.TextParsingMode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        try {
//            System.out.println(getClass().getField("i").getName());
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }

        Pie pie = new Pie();
        TextParsingMode textParsingMode = null;
        pie.setData(new String[] {"['John' , 10000]", "['Jake' , 12000]", "['Peter' , 18000]", "['James' , 11000]", "['Mary' , 9000]"}, textParsingMode);
//        pie.setData(data);
        pie.setInnerradius(90d);
        pie.setExplodeslices(true);
        pie.setTitle("HRFTG yey");
        pie.setAnimation(true, 2000d);
        pie.setStartangle(30d);

        Cartesian cartesian = new Cartesian();
        cartesian.setData(new String[] {"['John' , 10000]", "['Jake' , 12000]", "['Peter' , 18000]", "['James' , 11000]", "['Mary' , 9000]"});

//        String[] a = {"#000000", "#000000"};
//        com.anychart.anychart.GradientKey[] a = {new com.anychart.anychart.GradientKey("#000000", 0d, 1d), new com.anychart.anychart.GradientKey("#000000", 0d, 1d),
//                new com.anychart.anychart.GradientKey("#000000", 0d, 1d)};
//        com.anychart.anychart.LinearGradientFill linearGradientFill = new com.anychart.anychart.LinearGradientFill(a, true, 90d, 1d);
//        System.out.println(linearGradientFill.getStr());

        Fill linearGradientFill = new com.anychart.anychart.LinearGradientFill(new String[]{"\"#000000\"", "\"#987654\""}, false, 90d, .8d);
        Fill solidFill = new com.anychart.anychart.SolidFill("#000000", .9d);
        pie.setFill(linearGradientFill);
        cartesian.setTitle("Cartesian");

        DistinctColors distinctColors = new DistinctColors();
        SolidFill[] a = {new SolidFill("#F44336", 1d), new SolidFill("#FFEB3B", 1d), new SolidFill("#795548", 1d), new SolidFill("#4CAF50", 1d)};
        distinctColors.setItems(a, new SolidFill("#123456", 1d));
        cartesian.setPalette(distinctColors);
//        cartesian.

//        List<String> colors = new ArrayList<>(Arrays.asList("#90caf9", "#80cbc4", "#aed581", "#e6ee9c", "#000000"));
//        pieChart.setPalette(colors);

//        pieChart.setOnClickListener(new JavaScriptInterface.OnClick() {
//            @Override
//            public void onClick(Event event) {
//                Toast.makeText(MainActivity.this, String.format(Locale.US, "x: %s, value: %s", event.getX(), event.getValue()), Toast.LENGTH_SHORT).show();
//            }
//        });

        final AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);
        anyChartView.setChart(pie);
    }

}