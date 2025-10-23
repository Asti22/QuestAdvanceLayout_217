package com.example.myuipertama

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // --- HEADER ---
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 22.sp,
            color = Color.Gray,
            fontFamily = FontFamily.SansSerif
        )

        Spacer(modifier = Modifier.height(25.dp))

        // --- CARD 1 ---
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White
                    )
                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 16.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
            }
        }

        // --- CARD 2 ---
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF64B5F6)),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = stringResource(id = R.string.nama1),
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White
                    )
                    Text(
                        text = stringResource(id = R.string.alamat1),
                        fontSize = 16.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.nomer1),
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
            }
        }

        // --- CARD 3 ---
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFA5D6A7))
            ,
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text(
                        text = stringResource(id = R.string.nama2),
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White
                    )
                    Text(
                        text = stringResource(id = R.string.alamat2),
                        fontSize = 16.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.nomer2),
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
            }
        }

        // --- FOOTER ---
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = stringResource(id = R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}
