package br.com.gilbercs.jetsnack.composable

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import br.com.gilbercs.jetsnack.ui.theme.FIELD_ALL

//-------------------------------
//Criar component p/ campos no app
//-------------------------------
@Composable
fun SnackTextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    @StringRes placeholder: Int,
    @StringRes label: Int,
    leadingIcon: ImageVector,
    @StringRes contentDescription: Int,
    keyboardOptions: KeyboardOptions
){
    /**
     * Criar campo
     */
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth().padding(FIELD_ALL),
        value = value,
        onValueChange = {onValueChange(it)},
        label = {
            Text(text = stringResource(id = label))
        },
        placeholder = {
            Text(text = stringResource(id = placeholder))
        },
        leadingIcon = {
            Icon(
                imageVector = leadingIcon,
                contentDescription = stringResource(id = contentDescription),
                tint = MaterialTheme.colorScheme.primary
            )
        },
        keyboardOptions = keyboardOptions
    )
}