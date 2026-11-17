package com.example.thiandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thiandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var currentSoThuTu_2344 = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Nút Kiểm tra gọi hàm kiemTra_2344()
        binding.btnKiemTra.setOnClickListener {
            kiemTra_2344()
        }

        // Nút Xóa gọi hàm xoa_2344()
        binding.btnXoa.setOnClickListener {
            xoa_2344()
        }
    }

    fun kiemTra_2344() {
        val inputTen = binding.edtHoTen.text.toString().chuanHoaten_2344()
        val inputSoLuongStr = binding.edtSoLuong.text.toString()

        if (inputTen.isEmpty()) {
            binding.txtError.text = "Họ tên không được để trống"
            return
        }

        val soLuong = inputSoLuongStr.toIntOrNull() ?: 0
        if (soLuong <= 0) {
            binding.txtError.text = "Số lượng phải lớn hơn 0"
            return
        }

        val maLuot = QuyTacPhieu_2344.taoMaPhieu_2344(currentSoThuTu_2344++)
        val luotNhan = LuotNhan(maLuot, inputTen, soLuong)

        binding.txtHienThiMa.text = "Mã: ${luotNhan.maLuot_2344}"
        binding.txtLoiChao.text = "Xin chào ${luotNhan.hoTen_2344}, số lượng: ${luotNhan.soLuong_2344}"
        binding.txtError.text = ""
    }

    fun xoa_2344() {
        binding.edtHoTen.text?.clear()
        binding.edtSoLuong.text?.clear()
        binding.txtHienThiMa.text = ""
        binding.txtLoiChao.text = ""
        binding.txtError.text = ""
    }
}