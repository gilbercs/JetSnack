package br.com.gilbercs.jetsnack.ui.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.People
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import br.com.gilbercs.jetsnack.R
import br.com.gilbercs.jetsnack.composable.SnackTextField
import br.com.gilbercs.jetsnack.ui.theme.COLUMN_ALL
import br.com.gilbercs.jetsnack.ui.theme.FIELD_ALL

//-------------------------------------
//Tela de Login e cadastro será apresentada
//quando iniciar o App
//-------------------------------------
@Composable
fun LoginScreen(){
    /**
     * Declaração de variaveis
     */
    val name = remember { mutableStateOf(TextFieldValue())}
    val email = remember { mutableStateOf(TextFieldValue())}
    val phone = remember { mutableStateOf(TextFieldValue())}
    val password = remember { mutableStateOf(TextFieldValue())}

    var islogin by remember { mutableStateOf(false)}

    /**
     * Column: Adaptar a tela
     */
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(COLUMN_ALL)
            .verticalScroll(rememberScrollState())
    ) {
        /**
         * Segunda para organizar o componentes
         */
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(COLUMN_ALL),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
                ){
            /**
             * Image: Logo do projeto
             */
            Image(
                modifier = Modifier.size(150.dp),
                painter = painterResource(id = R.drawable.icon_logo),
                contentDescription = "Logo" )
            /**
             * Texto de logar ou cadastrar
             */
            Text(
                text = if (islogin) stringResource(id = R.string.title_register)
                else stringResource(id = R.string.title_login),
                style = MaterialTheme.typography.displaySmall
            )
            /**
             * Campos cadastrar
             */
            if (islogin){
                /**
                 * campo nome
                 */
                SnackTextField(
                    value = name.value,
                    onValueChange = {name.value = it},
                    placeholder = R.string.placeholder_name,
                    label = R.string.label_name,
                    leadingIcon = Icons.Outlined.People,
                    contentDescription = R.string.content_description_name,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )
                )
                /**
                 * campo email
                 */
                SnackTextField(
                    value = email.value,
                    onValueChange = {email.value = it},
                    placeholder = R.string.placeholder_email,
                    label = R.string.label_email,
                    leadingIcon = Icons.Outlined.Email,
                    contentDescription = R.string.content_description_name,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    )
                )
                /**
                 * campo phone
                 */
                SnackTextField(
                    value = phone.value,
                    onValueChange = {phone.value = it},
                    placeholder = R.string.placeholder_phone,
                    label = R.string.label_phone,
                    leadingIcon = Icons.Outlined.Phone,
                    contentDescription = R.string.content_description_name,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Phone,
                        imeAction = ImeAction.Next
                    )
                )
                /**
                 * campo password
                 */
                    SnackTextField(
                        value = password.value,
                        onValueChange = {password.value = it},
                        placeholder = R.string.placeholder_password,
                        label = R.string.label_password,
                        leadingIcon = Icons.Outlined.Lock,
                        contentDescription = R.string.content_description_name,
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Password,
                            imeAction = ImeAction.Done
                        )
                    )
            }else{
                /**
                 * Entrar
                 */
                SnackTextField(
                    value = email.value,
                    onValueChange = {email.value = it},
                    placeholder = R.string.placeholder_email,
                    label = R.string.label_email,
                    leadingIcon = Icons.Outlined.Email,
                    contentDescription = R.string.content_description_name,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    )
                )

                /**
                 * campo Senha
                 */
                SnackTextField(
                    value = password.value,
                    onValueChange = {password.value = it},
                    placeholder = R.string.placeholder_password,
                    label = R.string.label_password,
                    leadingIcon = Icons.Outlined.Lock,
                    contentDescription = R.string.content_description_name,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    )
                )

            }
            /**
             * Criar Botton entrar o cadastrar
             */
            OutlinedButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(FIELD_ALL),
                shape = MaterialTheme.shapes.extraSmall,
                onClick = {

                }) {
                Text(text = if (islogin) stringResource(id = R.string.buttom_create) else stringResource(
                    id = R.string.buttom_login),
                    style = MaterialTheme.typography.headlineSmall
                )
            }
            /**
             * registrar o entrar
             */
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = if (islogin) stringResource(id = R.string.text_user_yes) else stringResource(
                        id = R.string.text_user_no)
                )
                Text(
                    modifier = Modifier
                        .clickable { islogin = !islogin}
                        .padding(),
                    text = if (islogin) stringResource(id = R.string.text_enter) else stringResource(
                        id = R.string.text_add),
                    color = Color.Blue
                )
            }
            
        }
    }
}