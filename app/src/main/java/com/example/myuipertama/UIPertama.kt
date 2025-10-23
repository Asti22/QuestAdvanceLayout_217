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

        // --- Bagian Header ---
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
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Blue),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Row(modifier = Modifier.padding(8.dp)) {
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
        }

        // --- CARD 2 ---
        Spacer(modifier = Modifier.height(10.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Blue)
        ) {
            Row(modifier = Modifier.padding(8.dp)) {
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.nomer),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
        }

        // --- CARD 3 ---
        Spacer(modifier = Modifier.height(10.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Green)
        ) {
            Row(modifier = Modifier.padding(8.dp)) {
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.nomer),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
        }

        // --- FOOTER ---
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 40.dp)
        ) {
            Text(
                text = stringResource(id = R.string.copy),
                modifier = Modifier.align(Alignment.Center),
                color = Color.DarkGray,
                fontSize = 14.sp
            )
        }
    }
}
