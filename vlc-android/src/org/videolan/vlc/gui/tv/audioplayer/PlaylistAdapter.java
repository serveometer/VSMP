package org.videolan.vlc.gui.tv.audioplayer;

import java.util.ArrayList;

import org.videolan.libvlc.Media;
import org.videolan.vlc.MediaLibrary;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.ViewHolder> {
    private ArrayList<String> mDataset;
	private static MediaLibrary sMediaLibrary = MediaLibrary.getInstance();

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitleTv;
        public TextView mArtistTv;
        public ViewHolder(View v) {
            super(v);
            mTitleTv = (TextView) v.findViewById(android.R.id.text1);
            mTitleTv.setTextAppearance(v.getContext(), android.R.style.TextAppearance_DeviceDefault_Small);
            mArtistTv = (TextView) v.findViewById(android.R.id.text2);
            mArtistTv.setTextAppearance(v.getContext(), android.R.style.TextAppearance_DeviceDefault_Small_Inverse);
        }
    }

    public PlaylistAdapter(ArrayList<String> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public PlaylistAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                               .inflate(android.R.layout.simple_list_item_2, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Media media = sMediaLibrary.getMediaItem(mDataset.get(position));
        holder.mTitleTv.setText(media.getTitle());
        holder.mArtistTv.setText(media.getArtist());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}