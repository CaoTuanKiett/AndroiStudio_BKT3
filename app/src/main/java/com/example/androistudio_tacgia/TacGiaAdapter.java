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

public class TacGiaAdapter extends BaseAdapter {
    private Context context;
    private List<TacGia> list;
    public TacGiaAdapter(Context context, List<TacGia> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    //trả về số lượng các employee hiện có trong danh sách.
    }

    @Override
    public Object getItem(int position) {
        if (position < 0)
            return null;

        return list.get(position);
        //lấy thành phần tại vị trí truyền vào.
    }

    @Override
    public long getItemId(int i) {
        return i;
    }




    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.layout_tacgia_item, null);

        TextView tvname = view.findViewById(R.id.tvName);
        ImageView ivImage = view.findViewById(R.id.imageView);
        TextView tvInfo = view.findViewById(R.id.tvInfo);
        LinearLayout itemAuthor = view.findViewById(R.id.item_author);

        TacGia tacGia = list.get(i);
//        tvname.setText(emp.getName());
//        ivImage.setImageResource(emp.getImageid());
        tvname.setText(tacGia.getNameTacGia());
        ivImage.setImageResource(tacGia.getImgTacGia());
        tvInfo.setText(tacGia.getthongTin());
        itemAuthor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickGotoDeTail(tacGia);
            }
        });
        return view;
    }
    private void onClickGotoDeTail(TacGia tacGia){
        Intent intent = new Intent(context, TacPhamActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_author", tacGia);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
