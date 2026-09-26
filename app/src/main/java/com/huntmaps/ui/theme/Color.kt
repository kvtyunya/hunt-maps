package com.huntmaps.ui.theme

import androidx.compose.ui.graphics.Color

/*
 * Палитра приложения — снята с официального сайта huntshowdown.com.
 * Идея: почти чёрный тёплый фон, костяной белый текст (как кнопки
 * WATCH TRAILER на сайте), кровавый красный акцентов (кнопки BUY NOW)
 * и старое золото для маркеров на картах.
 */

val BgBase = Color(0xFF0C0A08)       // фон экранов — тёплый почти чёрный
val BgSurface = Color(0xFF211B13)    // карточки — заметно тёплый коричневый
val BgPanel = Color(0xFF262017)      // боковая панель фильтра
val Outline = Color(0xFF4A4132)      // тёплые линии и рамки (видимые)

val TextPrimary = Color(0xFFEFEAE0)  // костяной белый — основной текст
val TextSecondary = Color(0xFFB0A592)// приглушённый тёплый серый

val AccentGold = Color(0xFFC8A55A)   // золото: значки маркеров, переключатели
val AccentRed = Color(0xFFA82437)    // кровавый красный кнопок сайта (BUY NOW)
val Ink = Color(0xFF12100C)          // тёмный для текста/иконок на светлых кнопках

val BoneButton = Color(0xFFEFEEEB)   // костяная заливка кнопок (WATCH TRAILER)

val ScrimDark = Color(0x80000000)    // полупрозрачное затемнение под панелью
val TopBarFade = Color(0xB30C0A08)   // градиент-подложка под верхней панелью
