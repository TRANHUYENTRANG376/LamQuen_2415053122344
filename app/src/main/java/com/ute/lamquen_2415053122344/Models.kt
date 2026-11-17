package com.ute.lamquen_2415053122344

class Models {
    data class LuotNhan(
        val maLuot_2344: String,
        val hoTen_2344: String,
        val soLuong_2344:Int
    )
    fun String.chuanHoaten_2344():String{
        return this.trim().replace(Regex("\\s+")," ")
    }
    object QuyTacPhieu_2344 {
        fun taoMaPhieu_2344(soThuTu:Int):String {
            return "L$soThuTu"
        }
    }
}