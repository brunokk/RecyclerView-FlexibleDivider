package com.yqritc.recyclerviewflexibledivider.sample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by yqritc on 2015/01/08.
 */
public class SimpleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    private LayoutInflater mLayoutInflater;

    public SimpleAdapter(Context context) {
        super();
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.layout_sample_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mSampleText.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return 32;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mSampleText;

        public ViewHolder(View view) {
            super(view);
            mSampleText = (TextView) view.findViewById(R.id.text_sample);
        }
    }
}
