package org.videolan.vlc.gui.tv;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaItemDetails implements Parcelable {

	private String title, subTitle, body, location;

	public MediaItemDetails(String title, String subTitle, String body, String location) {
		this.title = title;
		this.subTitle = subTitle;
		this.body = body;
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public String getBody() {
		return body;
	}

	public String getLocation(){
		return location;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(title);
		dest.writeString(subTitle);
		dest.writeString(body);
		dest.writeString(location);
	}

	public static final Parcelable.Creator<MediaItemDetails> CREATOR
	= new Parcelable.Creator<MediaItemDetails>() {
		public MediaItemDetails createFromParcel(Parcel in) {
			return new MediaItemDetails(in);
		}

		public MediaItemDetails[] newArray(int size) {
			return new MediaItemDetails[size];
		}
	};

	private MediaItemDetails(Parcel in) {
		title = in.readString();
		subTitle = in.readString();
		body = in.readString();
		location = in.readString();
	}
}
