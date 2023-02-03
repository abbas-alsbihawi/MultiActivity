package com.alsbihawi.abbas.multiactivity.model

import android.os.Parcel
import android.os.Parcelable

class User(var usenmae: String?, var fullname: String?,) : Parcelable {

    init {
//        do something
    }

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    fun foo(){
        //        do something
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(usenmae)
        parcel.writeString(fullname)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }

}