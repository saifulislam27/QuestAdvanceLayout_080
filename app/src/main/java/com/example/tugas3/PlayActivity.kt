package com.example.tugas3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun PlayActivity(){
    Column  (modifier = Modifier.fillMaxSize()){
        HeaderSection()
        Text(text = "Kepada Yth,")
        Text(text = "Jamal")
        Spacer(modifier = Modifier.size(50.dp))
        DetailSurat(
            judul = "Nama",
            isi = "Saiful Islam"
        )
        DetailSurat(
            judul = "Email",
            isi = "saifulislam@gmail.com"
        )
        DetailSurat(
            judul = "NoTlp",
            isi = "20210140080"
        )
        DetailSurat(
            judul = "Keterangan",
            isi = "hello budy"
        )

    }

}

@Composable
fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)
            .padding(20.dp)
    ) {
        Row {
            Column {
                Text(
                    text = "Daerah Istimewa Yogyakarta",
                    color = Color.White
                )
                Text(
                    text = "FAX : 990900, Tlp : 998988",
                    color = Color.White
                )
            }
            Box(
                contentAlignment = Alignment.BottomStart
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "Max",
                    modifier = Modifier.size(100.dp)
                        .clip(CircleShape)
                )
                Icon(
                    imageVector = Icons.Default.Done,
                    contentDescription = null
                )
            }
        }
    }
}
@Composable
fun DetailSurat() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        Row(
            modifier = Modifier.fillMaxWidth().padding(2.dp)
        ) {
            Text(
                text = "Nama",
                modifier = Modifier.weight(0.8f)
            )
            Text(
                text = ":",
                modifier = Modifier.weight(0.2f)
            )
            Text(
                text = "Jamet ku dasi",
                modifier = Modifier.weight(2f)
            )


            }
        }
    }

@Composable
fun DetailSurat(
    judul: String, isi: String
){
    Column (
        modifier = Modifier.fillMaxWidth()
    ){
        Row (
            modifier = Modifier.fillMaxWidth().padding(2.dp)
        ){
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = isi,
                modifier = Modifier.weight(2f))

            }
        }
}
