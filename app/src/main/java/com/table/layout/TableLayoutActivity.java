package com.table.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class TableLayoutActivity extends AppCompatActivity {

    private Typeface custom_font;

    private ArrayList<TableModel> tableModelArrayList;
    private HorizontalScrollView horizontalScrollView;

    private TableLayout tableLayout;
    private TableRow tableRow;
    private TableRow.LayoutParams tableRowLayoutParams;
    private TextView textViewArray;
    private TextView textViewArray1;
    private TextView textViewArray2;
    private TextView textViewArray3;
    private TextView textViewArray4;
    private TextView textViewArray5;

    private int numberOfRowsToBeCreateInTableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        initView();
        initObject();
        initData();

        /*******get number of table to be create********/
        numberOfRowsToBeCreateInTableLayout = tableModelArrayList.size();

        if (numberOfRowsToBeCreateInTableLayout==0)
        {
            Toast.makeText(this, "please fill row data", Toast.LENGTH_LONG).show();
        }
        else
        {
            createTableLayout(numberOfRowsToBeCreateInTableLayout);
        }
    }

    private void initView()
    {
        horizontalScrollView = findViewById(R.id.horizontal_scroll_view);
        tableLayout = new TableLayout(this);
        TableLayout.LayoutParams tableRowParams = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
        tableLayout.setLayoutParams(tableRowParams);
        tableLayout.setStretchAllColumns(true);
    }

    private void initObject()
    {
        custom_font=Typeface.createFromAsset(getAssets(),"fonts/roboto_regular.ttf");
        tableRowLayoutParams = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
    }

    private void initData()
    {
        tableModelArrayList = new ArrayList<TableModel>();

        /*******this data add for table header********/
        tableModelArrayList.add(new TableModel("BASE","SUB", "ID", "NAME", "MRP", "QUANTITY"));

        for (int i = 0; i < 10; i++)
        {
            tableModelArrayList.add(new TableModel("product base "+i,"product sub "+i, "product id "+i, "product name "+i, "product mrp "+i, "prodcut qty "+i));
        }
    }

    private void createTableLayout(int numberOfRowsToBeCreateInTableLayout)
    {
        tableLayout.removeAllViews();

        for (int j = 0; j <numberOfRowsToBeCreateInTableLayout ; j++)
        {
            for (int i = 0; i < 1; i++)
            {
                tableRow = new TableRow(this);
                tableRow.setLayoutParams(tableRowLayoutParams);
                tableRow.setOrientation(LinearLayout.HORIZONTAL);
                tableRow.setGravity(Gravity.CENTER);

                textViewArray = new TextView(this);
                textViewArray.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT, 1f));
                String base = tableModelArrayList.get(j).getProductBaseCategory();
                textViewArray.setText(base);
                textViewArray.setBackgroundResource(R.drawable.table_cell_shape);
                textViewArray.setTextSize(15);
                textViewArray.setTypeface(custom_font);
                textViewArray.setGravity(Gravity.CENTER);
                textViewArray.setPadding(15, 15, 15, 15);
                textViewArray.setTextColor(Color.BLACK);
                tableRow.addView(textViewArray);

                textViewArray1 = new TextView(this);
                textViewArray1.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT, 1f));
                String sub = tableModelArrayList.get(j).getProductSubCategory();
                textViewArray1.setText(sub);
                textViewArray1.setBackgroundResource(R.drawable.table_cell_shape);
                textViewArray1.setTextSize(15);
                textViewArray1.setTypeface(custom_font);
                textViewArray1.setGravity(Gravity.CENTER);
                textViewArray1.setPadding(15, 15, 15, 15);
                textViewArray1.setTextColor(Color.BLACK);
                tableRow.addView(textViewArray1);

                textViewArray2 = new TextView(this);
                textViewArray2.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT, 1f));
                String id = tableModelArrayList.get(j).getProductId();
                textViewArray2.setText(id);
                textViewArray2.setBackgroundResource(R.drawable.table_cell_shape);
                textViewArray2.setTextSize(15);
                textViewArray2.setTypeface(custom_font);
                textViewArray2.setGravity(Gravity.CENTER);
                textViewArray2.setPadding(15, 15, 15, 15);
                textViewArray2.setTextColor(Color.BLACK);
                tableRow.addView(textViewArray2);

                textViewArray3 = new TextView(this);
                textViewArray3.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT, 1f));
                String name = tableModelArrayList.get(j).getProductName();
                textViewArray3.setText(name);
                textViewArray3.setBackgroundResource(R.drawable.table_cell_shape);
                textViewArray3.setTextSize(15);
                textViewArray3.setTypeface(custom_font);
                textViewArray3.setGravity(Gravity.CENTER);
                textViewArray3.setPadding(15, 15, 15, 15);
                textViewArray3.setTextColor(Color.BLACK);
                tableRow.addView(textViewArray3);

                textViewArray4 = new TextView(this);
                textViewArray4.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT, 1f));
                String mrp = tableModelArrayList.get(j).getProductMRP();
                textViewArray4.setText(mrp);
                textViewArray4.setBackgroundResource(R.drawable.table_cell_shape);
                textViewArray4.setTextSize(15);
                textViewArray4.setTypeface(custom_font);
                textViewArray4.setGravity(Gravity.CENTER);
                textViewArray4.setPadding(15, 15, 15, 15);
                textViewArray4.setTextColor(Color.BLACK);
                tableRow.addView(textViewArray4);

                textViewArray5 = new TextView(this);
                textViewArray5.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT, 1f));
                String quantity = tableModelArrayList.get(j).getProductQuantity();
                textViewArray5.setText(quantity);
                textViewArray5.setBackgroundResource(R.drawable.table_cell_shape);
                textViewArray5.setTextSize(15);
                textViewArray5.setTypeface(custom_font);;
                textViewArray5.setGravity(Gravity.CENTER);
                textViewArray5.setPadding(15, 15, 15, 15);
                textViewArray5.setTextColor(Color.BLACK);
                tableRow.addView(textViewArray5);
            }
            tableLayout.addView(tableRow);
        }
        horizontalScrollView.addView(tableLayout);
    }
}