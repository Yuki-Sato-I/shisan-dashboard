package com.personal.shisan.gen.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid

/**
 * 未ハンドリングエラー
 * @param code 結果コード
 * @param message エラーメッセージ
 * @param requestId リクエストID
 */
data class SystemError(

    @get:JsonProperty("code") val code: kotlin.String? = null,

    @get:JsonProperty("message") val message: kotlin.String? = null,

    @get:JsonProperty("requestId") val requestId: kotlin.String? = null
    ) {

}

