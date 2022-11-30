package com.example.androistudio_tacgia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class TacPhamAdapter extends BaseAdapter {
    private Context context;
    private List<TacPham> list;
    public TacPhamAdapter(Context context, List<TacPham> list) {
        this.context = context;
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        if (position < 0)
            return null;

        return list.get(position);    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.tacpham_item, null);

        TextView tvname = view.findViewById(R.id.tvNameTP);
        ImageView ivImage = view.findViewById(R.id.imageViewTP);
        TextView tvInfo = view.findViewById(R.id.tvThongTinTP);
        LinearLayout itemTacPham = view.findViewById(R.id.imageViewTP);


        TacPham tacPham = list.get(position);

        tvname.setText(tacPham.getNameTacPham());
        ivImage.setImageResource(tacPham.getImgTacPham());
        tvInfo.setText(tacPham.getThongTinTP());

        itemTacPham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickGotoTP(tacPham);
            }
        });
        return view;
    }
    private void onClickGotoTP(TacPham tacPham){
        Intent intent = new Intent(context, TacPhamActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_author", tacPham);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
