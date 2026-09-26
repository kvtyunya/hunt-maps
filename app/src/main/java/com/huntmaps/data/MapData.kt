package com.huntmaps.data

import com.huntmaps.R

/*
 * ============================================================
 *  ДАННЫЕ КАРТ — именно этот файл ты будешь наполнять.
 * ============================================================
 *
 *  Как записывается точка:
 *
 *  LootPoint(LootType.CASH_REGISTERS, x = 0.62f, y = 0.30f, note = "Большой дом")
 *              ^ тип метки             ^ доля ширины   ^ доля высоты
 *
 *  x = 0.0 — левый край карты,   x = 1.0 — правый край
 *  y = 0.0 — верх карты,         y = 1.0 — низ
 *
 *  Координаты удобно снимать в инструменте tools/coordinates.html:
 *  открой его в браузере, перетащи туда картинку карты, кликай по местам —
 *  он выдаст готовые строчки, которые останется вставить сюда.
 *
 *  Названия локаций (подписи на карте) записываются похоже:
 *
 *  MapLocation("Ферма Элис", x = 0.59f, y = 0.40f)
 *
 *  и добавляются в список locations внутри нужной карты. Показывать и
 *  скрывать подписи можно кнопкой-тегом в верхней панели экрана карты.
 */
object MapData {

    val maps: List<GameMap> = listOf(

        GameMap(
            id = "stillwater",
            name = "Болота Стилуотер",
            subtitle = "Топкие низины и старые фермы",
            imageRes = R.drawable.map_stillwater,
            locations = listOf(
                MapLocation("Рыбное хозяйство «Ален и сын»", x = 0.165f, y = 0.175f),
                MapLocation("Лесопильня Рейнарда", x = 0.395f, y = 0.165f),
                MapLocation("Порт Рикер", x = 0.645f, y = 0.195f),
                MapLocation("Гиблое озеро", x = 0.850f, y = 0.145f),
                MapLocation("Скотный двор Дэрроу", x = 0.470f, y = 0.265f),
                MapLocation("Ферма Элис", x = 0.590f, y = 0.405f),
                MapLocation("Часовня Черной Мадонны", x = 0.835f, y = 0.370f),
                MapLocation("Кладбище Бланшетт", x = 0.225f, y = 0.440f),
                MapLocation("Верфь Локбей", x = 0.460f, y = 0.465f),
                MapLocation("Излучина Стилуотер", x = 0.755f, y = 0.580f),
                MapLocation("Разрушенный крематорий", x = 0.335f, y = 0.710f),
                MapLocation("Церковь «Исцеляющие воды»", x = 0.550f, y = 0.720f),
                MapLocation("Кипарисовая роща", x = 0.120f, y = 0.815f),
                MapLocation("Ранчо Даванта", x = 0.345f, y = 0.935f),
                MapLocation("Скотобойня", x = 0.575f, y = 0.940f),
                MapLocation("Сомовая роща", x = 0.840f, y = 0.873f)
            ),
            points = listOf(
                LootPoint(LootType.CASH_REGISTERS, x = 0.3411f, y = 0.6897f, photo = "stillwater/stillwater_cash_1.webp"), // №1
                LootPoint(LootType.CASH_REGISTERS, x = 0.3422f, y = 0.7323f, photo = "stillwater/stillwater_cash_2.webp"), // №2
                LootPoint(LootType.CASH_REGISTERS, x = 0.3231f, y = 0.6893f, photo = "stillwater/stillwater_cash_3.webp"), // №3
                LootPoint(LootType.CASH_REGISTERS, x = 0.3367f, y = 0.6564f, photo = "stillwater/stillwater_cash_4.webp"), // №4
                LootPoint(LootType.CASH_REGISTERS, 0.1064f, 0.8213f, photo = "stillwater/stillwater_cash_5.webp"), // №5
                LootPoint(LootType.CASH_REGISTERS, 0.1040f, 0.8037f, photo = "stillwater/stillwater_cash_6.webp"), // №6
                LootPoint(LootType.CASH_REGISTERS, 0.1123f, 0.7939f, photo = "stillwater/stillwater_cash_7.webp"), // №7
                LootPoint(LootType.CASH_REGISTERS, 0.1128f, 0.7905f, photo = "stillwater/stillwater_cash_8.webp"), // №8
                LootPoint(LootType.CASH_REGISTERS, x = 0.2803f, y = 0.9556f, photo = "stillwater/stillwater_cash_9.webp"), // №9
                LootPoint(LootType.CASH_REGISTERS, x = 0.3379f, y = 0.9313f, photo = "stillwater/stillwater_cash_10.webp"), // №10
                LootPoint(LootType.CASH_REGISTERS, x = 0.3527f, y = 0.9014f, photo = "stillwater/stillwater_cash_11.webp"), // №11
                LootPoint(LootType.CASH_REGISTERS, x = 0.3377f, y = 0.8993f, photo = "stillwater/stillwater_cash_12.webp"), // №12
                LootPoint(LootType.CASH_REGISTERS, x = 0.3801f, y = 0.9394f, photo = "stillwater/stillwater_cash_13.webp"), // №13
                LootPoint(LootType.CASH_REGISTERS, x = 0.5477f, y = 0.9087f, photo = "stillwater/stillwater_cash_14.webp"), // №14
                LootPoint(LootType.CASH_REGISTERS, x = 0.5521f, y = 0.9021f, photo = "stillwater/stillwater_cash_15.webp"), // №15
                LootPoint(LootType.CASH_REGISTERS, x = 0.5559f, y = 0.9016f, photo = "stillwater/stillwater_cash_16.webp"), // №16
                LootPoint(LootType.CASH_REGISTERS, x = 0.8593f, y = 0.8020f, photo = "stillwater/stillwater_cash_17.webp"), // №17
                LootPoint(LootType.CASH_REGISTERS, x = 0.8212f, y = 0.8114f, photo = "stillwater/stillwater_cash_18.webp"), // №18
                LootPoint(LootType.CASH_REGISTERS, x = 0.8238f, y = 0.8081f, photo = "stillwater/stillwater_cash_19.webp"), // №19
                LootPoint(LootType.CASH_REGISTERS, x = 0.8055f, y = 0.8103f, photo = "stillwater/stillwater_cash_20.webp"), // №20
                LootPoint(LootType.CASH_REGISTERS, x = 0.7291f, y = 0.8030f, photo = "stillwater/stillwater_cash_21.webp"), // №21
                LootPoint(LootType.CASH_REGISTERS, x = 0.6837f, y = 0.8182f, photo = "stillwater/stillwater_cash_22.webp"), // №22
                LootPoint(LootType.CASH_REGISTERS, x = 0.5278f, y = 0.7167f, photo = "stillwater/stillwater_cash_23.webp"), // №23
                LootPoint(LootType.CASH_REGISTERS, x = 0.5361f, y = 0.6996f, photo = "stillwater/stillwater_cash_24.webp"), // №24
                LootPoint(LootType.CASH_REGISTERS, x = 0.5577f, y = 0.7105f, photo = "stillwater/stillwater_cash_25.webp"), // №25
                LootPoint(LootType.CASH_REGISTERS, x = 0.5601f, y = 0.7081f, photo = "stillwater/stillwater_cash_26.webp"), // №26
                LootPoint(LootType.CASH_REGISTERS, x = 0.5682f, y = 0.7065f, photo = "stillwater/stillwater_cash_27.webp"), // №27
                LootPoint(LootType.CASH_REGISTERS, x = 0.5481f, y = 0.6644f, photo = "stillwater/stillwater_cash_28.webp"), // №28
                LootPoint(LootType.CASH_REGISTERS, x = 0.7498f, y = 0.6055f, photo = "stillwater/stillwater_cash_29.webp"), // №29
                LootPoint(LootType.CASH_REGISTERS, x = 0.7438f, y = 0.6013f, photo = "stillwater/stillwater_cash_30.webp"), // №30
                LootPoint(LootType.CASH_REGISTERS, x = 0.7487f, y = 0.5861f, photo = "stillwater/stillwater_cash_31.webp"), // №31
                LootPoint(LootType.CASH_REGISTERS, x = 0.7482f, y = 0.5600f, photo = "stillwater/stillwater_cash_32.webp"), // №32
                LootPoint(LootType.CASH_REGISTERS, x = 0.7486f, y = 0.5546f, photo = "stillwater/stillwater_cash_33.webp"), // №33
                LootPoint(LootType.CASH_REGISTERS, x = 0.7712f, y = 0.5330f, photo = "stillwater/stillwater_cash_34.webp"), // №34
                LootPoint(LootType.CASH_REGISTERS, x = 0.4198f, y = 0.4584f, photo = "stillwater/stillwater_cash_35.webp"), // №35
                LootPoint(LootType.CASH_REGISTERS, x = 0.4441f, y = 0.4807f, photo = "stillwater/stillwater_cash_36.webp"), // №36
                LootPoint(LootType.CASH_REGISTERS, x = 0.4479f, y = 0.4774f, photo = "stillwater/stillwater_cash_37.webp"), // №37
                LootPoint(LootType.CASH_REGISTERS, x = 0.4363f, y = 0.4823f, photo = "stillwater/stillwater_cash_38.webp"), // №38
                LootPoint(LootType.CASH_REGISTERS, x = 0.3385f, y = 0.5618f, photo = "stillwater/stillwater_cash_39.webp"), // №39
                LootPoint(LootType.CASH_REGISTERS, x = 0.3423f, y = 0.5589f, photo = "stillwater/stillwater_cash_40.webp"), // №40
                LootPoint(LootType.CASH_REGISTERS, x = 0.1489f, y = 0.6078f, photo = "stillwater/stillwater_cash_41.webp"), // №41
                LootPoint(LootType.CASH_REGISTERS, x = 0.1504f, y = 0.6059f, photo = "stillwater/stillwater_cash_42.webp"), // №42
                LootPoint(LootType.CASH_REGISTERS, x = 0.1929f, y = 0.4484f, photo = "stillwater/stillwater_cash_43.webp"), // №43
                LootPoint(LootType.CASH_REGISTERS, x = 0.2267f, y = 0.4554f, photo = "stillwater/stillwater_cash_44.webp"), // №44
                LootPoint(LootType.CASH_REGISTERS, x = 0.2272f, y = 0.4528f, photo = "stillwater/stillwater_cash_45.webp"), // №45
                LootPoint(LootType.CASH_REGISTERS, x = 0.2284f, y = 0.4450f, photo = "stillwater/stillwater_cash_46.webp"), // №46
                LootPoint(LootType.CASH_REGISTERS, x = 0.2231f, y = 0.3732f, photo = "stillwater/stillwater_cash_47.webp"), // №47
                LootPoint(LootType.CASH_REGISTERS, x = 0.5497f, y = 0.3986f, photo = "stillwater/stillwater_cash_48.webp"), // №48
                LootPoint(LootType.CASH_REGISTERS, x = 0.5493f, y = 0.3791f, photo = "stillwater/stillwater_cash_49.webp"), // №49
                LootPoint(LootType.CASH_REGISTERS, x = 0.6220f, y = 0.3781f, photo = "stillwater/stillwater_cash_50.webp"), // №50
                LootPoint(LootType.CASH_REGISTERS, x = 0.6159f, y = 0.4182f, photo = "stillwater/stillwater_cash_51.webp"), // №51
                LootPoint(LootType.CASH_REGISTERS, x = 0.4604f, y = 0.2876f, photo = "stillwater/stillwater_cash_52.webp"), // №52
                LootPoint(LootType.CASH_REGISTERS, x = 0.4463f, y = 0.2628f, photo = "stillwater/stillwater_cash_53.webp"), // №53
                LootPoint(LootType.CASH_REGISTERS, x = 0.4506f, y = 0.2301f, photo = "stillwater/stillwater_cash_54.webp"), // №54
                LootPoint(LootType.CASH_REGISTERS, x = 0.4950f, y = 0.3004f, photo = "stillwater/stillwater_cash_55.webp"), // №55
                LootPoint(LootType.CASH_REGISTERS, x = 0.6518f, y = 0.2299f, photo = "stillwater/stillwater_cash_56.webp"), // №56
                LootPoint(LootType.CASH_REGISTERS, x = 0.6137f, y = 0.2081f, photo = "stillwater/stillwater_cash_57.webp"), // №57
                LootPoint(LootType.CASH_REGISTERS, x = 0.6090f, y = 0.1774f, photo = "stillwater/stillwater_cash_58.webp"), // №58
                LootPoint(LootType.CASH_REGISTERS, x = 0.6080f, y = 0.1653f, photo = "stillwater/stillwater_cash_59.webp"), // №59
                LootPoint(LootType.CASH_REGISTERS, x = 0.6118f, y = 0.1577f, photo = "stillwater/stillwater_cash_60.webp"), // №60
                LootPoint(LootType.CASH_REGISTERS, x = 0.6193f, y = 0.1561f, photo = "stillwater/stillwater_cash_61.webp"), // №61
                LootPoint(LootType.CASH_REGISTERS, x = 0.6119f, y = 0.1414f, photo = "stillwater/stillwater_cash_62.webp"), // №62
                LootPoint(LootType.CASH_REGISTERS, x = 0.6455f, y = 0.1611f, photo = "stillwater/stillwater_cash_63.webp"), // №63
                LootPoint(LootType.CASH_REGISTERS, x = 0.6782f, y = 0.1848f, photo = "stillwater/stillwater_cash_64.webp"), // №64
                LootPoint(LootType.CASH_REGISTERS, x = 0.9038f, y = 0.3832f, photo = "stillwater/stillwater_cash_65.webp"), // №65
                LootPoint(LootType.CASH_REGISTERS, x = 0.8770f, y = 0.3476f, photo = "stillwater/stillwater_cash_66.webp"), // №66
                LootPoint(LootType.CASH_REGISTERS, x = 0.8629f, y = 0.3586f, photo = "stillwater/stillwater_cash_67.webp"), // №67
                LootPoint(LootType.CASH_REGISTERS, x = 0.8789f, y = 0.3401f, photo = "stillwater/stillwater_cash_68.webp"), // №68
                LootPoint(LootType.CASH_REGISTERS, x = 0.8554f, y = 0.3422f, photo = "stillwater/stillwater_cash_69.webp"), // №69
                LootPoint(LootType.CASH_REGISTERS, x = 0.8676f, y = 0.3458f, photo = "stillwater/stillwater_cash_70.webp"), // №70
                LootPoint(LootType.CASH_REGISTERS, x = 0.8827f, y = 0.1282f, photo = "stillwater/stillwater_cash_71.webp"), // №71
                LootPoint(LootType.CASH_REGISTERS, x = 0.8398f, y = 0.1468f, photo = "stillwater/stillwater_cash_72.webp"), // №72
                LootPoint(LootType.CASH_REGISTERS, x = 0.7999f, y = 0.1263f, photo = "stillwater/stillwater_cash_73.webp"), // №73
                LootPoint(LootType.CASH_REGISTERS, x = 0.8040f, y = 0.1666f, photo = "stillwater/stillwater_cash_74.webp"), // №74
                LootPoint(LootType.CASH_REGISTERS, x = 0.8376f, y = 0.1143f, photo = "stillwater/stillwater_cash_75.webp"), // №75
                LootPoint(LootType.CASH_REGISTERS, x = 0.7569f, y = 0.1003f, photo = "stillwater/stillwater_cash_76.webp"), // №76
                LootPoint(LootType.CASH_REGISTERS, x = 0.2945f, y = 0.1557f, photo = "stillwater/stillwater_cash_77.webp"), // №77
                LootPoint(LootType.CASH_REGISTERS, x = 0.2897f, y = 0.1366f, photo = "stillwater/stillwater_cash_78.webp"), // №78
                LootPoint(LootType.CASH_REGISTERS, x = 0.2858f, y = 0.1282f, photo = "stillwater/stillwater_cash_79.webp"), // №79
                LootPoint(LootType.CASH_REGISTERS, x = 0.3050f, y = 0.1189f, photo = "stillwater/stillwater_cash_80.webp"), // №80
                LootPoint(LootType.CASH_REGISTERS, x = 0.3349f, y = 0.1559f, photo = "stillwater/stillwater_cash_81.webp"), // №81
                LootPoint(LootType.CASH_REGISTERS, x = 0.3409f, y = 0.1289f, photo = "stillwater/stillwater_cash_82.webp"), // №82
                LootPoint(LootType.CASH_REGISTERS, x = 0.1513f, y = 0.2335f, photo = "stillwater/stillwater_cash_83.webp"), // №83
                LootPoint(LootType.CASH_REGISTERS, x = 0.1482f, y = 0.1753f, photo = "stillwater/stillwater_cash_84.webp"), // №84
                LootPoint(LootType.CASH_REGISTERS, x = 0.1070f, y = 0.1677f, photo = "stillwater/stillwater_cash_85.webp"), // №85
                LootPoint(LootType.CASH_REGISTERS, x = 0.1417f, y = 0.1479f, photo = "stillwater/stillwater_cash_86.webp"), // №86
                LootPoint(LootType.CASH_REGISTERS, x = 0.1921f, y = 0.1656f, photo = "stillwater/stillwater_cash_87.webp"), // №87


                // — Верстаки
                LootPoint(LootType.WORKBENCHES, x = 0.1667f, y = 0.1708f),
                LootPoint(LootType.WORKBENCHES, x = 0.2930f, y = 0.1555f),
                LootPoint(LootType.WORKBENCHES, x = 0.3322f, y = 0.1476f),
                LootPoint(LootType.WORKBENCHES, x = 0.3968f, y = 0.1616f),
                LootPoint(LootType.WORKBENCHES, x = 0.6347f, y = 0.1313f),
                LootPoint(LootType.WORKBENCHES, x = 0.6139f, y = 0.1612f),
                LootPoint(LootType.WORKBENCHES, x = 0.6260f, y = 0.2019f),
                LootPoint(LootType.WORKBENCHES, x = 0.8308f, y = 0.1437f),
                LootPoint(LootType.WORKBENCHES, x = 0.5589f, y = 0.4147f),
                LootPoint(LootType.WORKBENCHES, x = 0.6197f, y = 0.4154f),
                LootPoint(LootType.WORKBENCHES, x = 0.4487f, y = 0.2289f),
                LootPoint(LootType.WORKBENCHES, x = 0.4750f, y = 0.2575f),
                LootPoint(LootType.WORKBENCHES, x = 0.4706f, y = 0.2601f),
                LootPoint(LootType.WORKBENCHES, x = 0.4506f, y = 0.2700f),
                LootPoint(LootType.WORKBENCHES, x = 0.2637f, y = 0.4369f),
                LootPoint(LootType.WORKBENCHES, x = 0.1645f, y = 0.7299f),
                LootPoint(LootType.WORKBENCHES, x = 0.3455f, y = 0.6795f),
                LootPoint(LootType.WORKBENCHES, x = 0.2825f, y = 0.9117f),
                LootPoint(LootType.WORKBENCHES, x = 0.2777f, y = 0.9813f),
                LootPoint(LootType.WORKBENCHES, x = 0.5474f, y = 0.9500f),
                LootPoint(LootType.WORKBENCHES, x = 0.8373f, y = 0.8190f),
                LootPoint(LootType.WORKBENCHES, x = 0.7328f, y = 0.7902f),
                LootPoint(LootType.WORKBENCHES, x = 0.5193f, y = 0.6798f),
                LootPoint(LootType.WORKBENCHES, x = 0.5476f, y = 0.6639f),
                LootPoint(LootType.WORKBENCHES, x = 0.7528f, y = 0.6015f),
                LootPoint(LootType.WORKBENCHES, x = 0.7870f, y = 0.5621f),
                LootPoint(LootType.WORKBENCHES, x = 0.7877f, y = 0.5439f),
                LootPoint(LootType.WORKBENCHES, x = 0.4606f, y = 0.4373f),
                LootPoint(LootType.WORKBENCHES, x = 0.4506f, y = 0.4804f),
                LootPoint(LootType.WORKBENCHES, x = 0.4537f, y = 0.4826f),
                LootPoint(LootType.WORKBENCHES, x = 0.4363f, y = 0.4874f),
                LootPoint(LootType.WORKBENCHES, x = 0.8510f, y = 0.4524f),

                // — Большая башня
                LootPoint(LootType.BIG_TOWER, x = 0.1494f, y = 0.6101f),
                LootPoint(LootType.BIG_TOWER, x = 0.3424f, y = 0.5616f),
                LootPoint(LootType.BIG_TOWER, x = 0.5904f, y = 0.5741f),

                // — Маленькая башня
                LootPoint(LootType.SMALL_TOWER, x = 0.0761f, y = 0.8850f),
                LootPoint(LootType.SMALL_TOWER, x = 0.0863f, y = 0.6985f),
                LootPoint(LootType.SMALL_TOWER, x = 0.2003f, y = 0.6771f),
                LootPoint(LootType.SMALL_TOWER, x = 0.3899f, y = 0.6521f),
                LootPoint(LootType.SMALL_TOWER, x = 0.4254f, y = 0.7929f),
                LootPoint(LootType.SMALL_TOWER, x = 0.7099f, y = 0.6962f),
                LootPoint(LootType.SMALL_TOWER, x = 0.7429f, y = 0.9048f),
                LootPoint(LootType.SMALL_TOWER, x = 0.8405f, y = 0.6839f),
                LootPoint(LootType.SMALL_TOWER, x = 0.7969f, y = 0.6060f),
                LootPoint(LootType.SMALL_TOWER, x = 0.6988f, y = 0.4731f),
                LootPoint(LootType.SMALL_TOWER, x = 0.9362f, y = 0.2294f),
                LootPoint(LootType.SMALL_TOWER, x = 0.7440f, y = 0.2136f),
                LootPoint(LootType.SMALL_TOWER, x = 0.3801f, y = 0.0245f),
                LootPoint(LootType.SMALL_TOWER, x = 0.9035f, y = 0.8659f),

                // — Точки эвакуации: найдены автоматически по карте-источнику —
                LootPoint(LootType.EXTRACT_POINTS, 0.2679f, 0.0352f),
                LootPoint(LootType.EXTRACT_POINTS, 0.5227f, 0.0381f),
                LootPoint(LootType.EXTRACT_POINTS, 0.7033f, 0.0423f),
                LootPoint(LootType.EXTRACT_POINTS, 0.1053f, 0.0590f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9665f, 0.0590f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9713f, 0.2545f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0455f, 0.3343f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0825f, 0.4917f),
                LootPoint(LootType.EXTRACT_POINTS, 0.3732f, 0.4982f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9318f, 0.5584f),
                LootPoint(LootType.EXTRACT_POINTS, 0.5365f, 0.5787f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0263f, 0.7163f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9121f, 0.7920f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0628f, 0.8504f),
                LootPoint(LootType.EXTRACT_POINTS, 0.7901f, 0.9172f),
                LootPoint(LootType.EXTRACT_POINTS, 0.1238f, 0.9613f),
                LootPoint(LootType.EXTRACT_POINTS, 0.4707f, 0.9726f),
                // — Точки спавна команды: найдены автоматически —
                LootPoint(LootType.TEAM_SPAWNS, 0.3104f, 0.0102f),
                LootPoint(LootType.TEAM_SPAWNS, 0.5671f, 0.0161f),
                LootPoint(LootType.TEAM_SPAWNS, 0.7404f, 0.0326f),
                LootPoint(LootType.TEAM_SPAWNS, 0.4299f, 0.0329f),
                LootPoint(LootType.TEAM_SPAWNS, 0.8754f, 0.0573f),
                LootPoint(LootType.TEAM_SPAWNS, 0.1737f, 0.0668f),
                LootPoint(LootType.TEAM_SPAWNS, 0.5018f, 0.0990f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9035f, 0.1049f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9543f, 0.1275f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0587f, 0.1329f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9538f, 0.2620f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0391f, 0.2938f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0584f, 0.4169f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9589f, 0.4573f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9133f, 0.5359f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0393f, 0.5506f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9385f, 0.6389f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0484f, 0.7145f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0389f, 0.7632f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9750f, 0.8099f),
                LootPoint(LootType.TEAM_SPAWNS, 0.1392f, 0.9406f),
                LootPoint(LootType.TEAM_SPAWNS, 0.7469f, 0.9496f),
                LootPoint(LootType.TEAM_SPAWNS, 0.8481f, 0.9577f),
                LootPoint(LootType.TEAM_SPAWNS, 0.4481f, 0.9799f),
                LootPoint(LootType.TEAM_SPAWNS, 0.6853f, 0.9816f),
                LootPoint(LootType.TEAM_SPAWNS, 0.2391f, 0.9882f),

                // — Точки снабжения
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6140f, y = 0.3307f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5550f, y = 0.3290f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5072f, y = 0.3988f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6421f, y = 0.3047f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7064f, y = 0.3564f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5429f, y = 0.2547f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4279f, y = 0.2311f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4698f, y = 0.1891f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3238f, y = 0.2513f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3407f, y = 0.3459f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3179f, y = 0.4060f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.1918f, y = 0.4933f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.2291f, y = 0.3190f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.1862f, y = 0.6397f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.2319f, y = 0.6087f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3168f, y = 0.5999f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3718f, y = 0.5272f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3993f, y = 0.6138f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4497f, y = 0.7304f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4625f, y = 0.7939f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5364f, y = 0.8062f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4974f, y = 0.8651f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6598f, y = 0.7505f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7074f, y = 0.7849f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6925f, y = 0.6898f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7281f, y = 0.6453f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.8005f, y = 0.4865f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6698f, y = 0.4845f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6442f, y = 0.4393f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5142f, y = 0.6283f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4862f, y = 0.5890f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5240f, y = 0.5769f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5239f, y = 0.5284f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7251f, y = 0.1067f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6430f, y = 0.3031f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7064f, y = 0.3580f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4605f, y = 0.7954f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3149f, y = 0.6017f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4717f, y = 0.1866f),

                // — Упавший шар
                LootPoint(LootType.FALLEN_BALL, x = 0.2002f, y = 0.6772f),
                LootPoint(LootType.FALLEN_BALL, x = 0.3434f, y = 0.4839f),
                LootPoint(LootType.FALLEN_BALL, x = 0.5820f, y = 0.3162f),
                LootPoint(LootType.FALLEN_BALL, x = 0.7963f, y = 0.6063f),
                LootPoint(LootType.FALLEN_BALL, x = 0.6341f, y = 0.7760f),
                LootPoint(LootType.FALLEN_BALL, x = 0.4247f, y = 0.7930f)
            )
        ),

        GameMap(
            id = "lawson",
            name = "Дельта Лоусон",
            subtitle = "Рукава реки и рыбацкие хутора",
            imageRes = R.drawable.map_lawson,
            locations = listOf(
                MapLocation("Пристань Годарда", x = 0.130f, y = 0.160f),
                MapLocation("Солодовня Бланка", x = 0.345f, y = 0.150f),
                MapLocation("Ферма «Золотые акры»", x = 0.630f, y = 0.170f),
                MapLocation("Свинина Солтера", x = 0.855f, y = 0.230f),
                MapLocation("Станция Лоусон", x = 0.470f, y = 0.260f),
                MapLocation("Гарнизон «Кровавая пасть»", x = 0.225f, y = 0.440f),
                MapLocation("Приход Аден", x = 0.720f, y = 0.425f),
                MapLocation("Мельница «Лобелия»", x = 0.510f, y = 0.500f),
                MapLocation("Ветреный простор", x = 0.885f, y = 0.570f),
                MapLocation("Литейный завод", x = 0.160f, y = 0.620f),
                MapLocation("Форт Кармик", x = 0.360f, y = 0.625f),
                MapLocation("Тюрьма Николлс", x = 0.715f, y = 0.610f),
                MapLocation("Дубильня «Кровавый дурман»", x = 0.860f, y = 0.800f),
                MapLocation("Лесопильня C&A", x = 0.630f, y = 0.790f),
                MapLocation("Арсенал Вульфсхеда", x = 0.200f, y = 0.830f),
                MapLocation("Кирпичный завод Бредли и Крейвена", x = 0.430f, y = 0.855f)
            ),
            points = listOf(
                // — Кассы: найдены автоматически по карте-источнику —
                LootPoint(LootType.CASH_REGISTERS, 0.3606f, 0.1344f, photo = "lawson/lawson_cash_1.webp"), // №1
                LootPoint(LootType.CASH_REGISTERS, 0.3168f, 0.1430f, photo = "lawson/lawson_cash_2.webp"), // №2
                LootPoint(LootType.CASH_REGISTERS, 0.1637f, 0.1506f, photo = "lawson/lawson_cash_3.webp"), // №3
                LootPoint(LootType.CASH_REGISTERS, 0.1028f, 0.1554f, photo = "lawson/lawson_cash_4.webp"), // №4
                LootPoint(LootType.CASH_REGISTERS, 0.3083f, 0.1630f, photo = "lawson/lawson_cash_5.webp"), // №5
                LootPoint(LootType.CASH_REGISTERS, 0.6070f, 0.1668f, photo = "lawson/lawson_cash_6.webp"), // №6
                LootPoint(LootType.CASH_REGISTERS, 0.1323f, 0.1802f, photo = "lawson/lawson_cash_7.webp"), // №7
                LootPoint(LootType.CASH_REGISTERS, 0.6346f, 0.1840f, photo = "lawson/lawson_cash_8.webp"), // №8
                LootPoint(LootType.CASH_REGISTERS, 0.6051f, 0.2011f, photo = "lawson/lawson_cash_9.webp"), // №9
                LootPoint(LootType.CASH_REGISTERS, 0.8164f, 0.2116f, photo = "lawson/lawson_cash_10.webp"), // №10
                LootPoint(LootType.CASH_REGISTERS, 0.6156f, 0.2126f, photo = "lawson/lawson_cash_11.webp"), // №11
                LootPoint(LootType.CASH_REGISTERS, 0.8525f, 0.2126f, photo = "lawson/lawson_cash_12.webp"), // №12
                LootPoint(LootType.CASH_REGISTERS, 0.4434f, 0.2193f, photo = "lawson/lawson_cash_13.webp"), // №13
                LootPoint(LootType.CASH_REGISTERS, 0.9610f, 0.2240f, photo = "lawson/lawson_cash_14.webp"), // №14
                LootPoint(LootType.CASH_REGISTERS, 0.7802f, 0.2412f, photo = "lawson/lawson_cash_15.webp"), // №15
                LootPoint(LootType.CASH_REGISTERS, 0.4662f, 0.2507f, photo = "lawson/lawson_cash_16.webp"), // №16
                LootPoint(LootType.CASH_REGISTERS, 0.5138f, 0.2745f, photo = "lawson/lawson_cash_17.webp"), // №17
                LootPoint(LootType.CASH_REGISTERS, 0.8145f, 0.2974f, photo = "lawson/lawson_cash_18.webp"), // №18
                LootPoint(LootType.CASH_REGISTERS, 0.4443f, 0.2993f, photo = "lawson/lawson_cash_19.webp"), // №19
                LootPoint(LootType.CASH_REGISTERS, 0.1418f, 0.3622f, photo = "lawson/lawson_cash_20.webp"), // №20
                LootPoint(LootType.CASH_REGISTERS, 0.1836f, 0.3966f, photo = "lawson/lawson_cash_21.webp"), // №21
                LootPoint(LootType.CASH_REGISTERS, 0.7498f, 0.4194f, photo = "lawson/lawson_cash_22.webp"), // №22
                LootPoint(LootType.CASH_REGISTERS, 0.2084f, 0.4299f, photo = "lawson/lawson_cash_23.webp"), // №23
                LootPoint(LootType.CASH_REGISTERS, 0.1779f, 0.4433f, photo = "lawson/lawson_cash_24.webp"), // №24
                LootPoint(LootType.CASH_REGISTERS, 0.7564f, 0.4538f, photo = "lawson/lawson_cash_25.webp"), // №25
                LootPoint(LootType.CASH_REGISTERS, 0.4938f, 0.4652f, photo = "lawson/lawson_cash_26.webp"), // №26
                LootPoint(LootType.CASH_REGISTERS, 0.9068f, 0.4719f, photo = "lawson/lawson_cash_27.webp"), // №27
                LootPoint(LootType.CASH_REGISTERS, 0.5252f, 0.4738f, photo = "lawson/lawson_cash_28.webp"), // №28
                LootPoint(LootType.CASH_REGISTERS, 0.8639f, 0.5500f, photo = "lawson/lawson_cash_29.webp"), // №29
                LootPoint(LootType.CASH_REGISTERS, 0.8887f, 0.5748f, photo = "lawson/lawson_cash_30.webp"), // №30
                LootPoint(LootType.CASH_REGISTERS, 0.7307f, 0.5834f, photo = "lawson/lawson_cash_31.webp"), // №31
                LootPoint(LootType.CASH_REGISTERS, 0.0124f, 0.5853f, photo = "lawson/lawson_cash_32.webp"), // №32
                LootPoint(LootType.CASH_REGISTERS, 0.7022f, 0.5891f, photo = "lawson/lawson_cash_33.webp"), // №33
                LootPoint(LootType.CASH_REGISTERS, 0.8754f, 0.5958f, photo = "lawson/lawson_cash_34.webp"), // №34
                LootPoint(LootType.CASH_REGISTERS, 0.7574f, 0.5977f, photo = "lawson/lawson_cash_35.webp"), // №35
                LootPoint(LootType.CASH_REGISTERS, 0.6632f, 0.6063f, photo = "lawson/lawson_cash_36.webp"), // №36
                LootPoint(LootType.CASH_REGISTERS, 0.1560f, 0.6111f, photo = "lawson/lawson_cash_37.webp"), // №37
                LootPoint(LootType.CASH_REGISTERS, 0.6489f, 0.6254f, photo = "lawson/lawson_cash_38.webp"), // №38
                LootPoint(LootType.CASH_REGISTERS, 0.7574f, 0.6254f, photo = "lawson/lawson_cash_39.webp"), // №39
                LootPoint(LootType.CASH_REGISTERS, 0.7250f, 0.6282f, photo = "lawson/lawson_cash_40.webp"), // №40
                LootPoint(LootType.CASH_REGISTERS, 0.1560f, 0.6311f, photo = "lawson/lawson_cash_41.webp"), // №41
                LootPoint(LootType.CASH_REGISTERS, 0.3578f, 0.6425f, photo = "lawson/lawson_cash_42.webp"), // №42
                LootPoint(LootType.CASH_REGISTERS, 0.3425f, 0.6482f, photo = "lawson/lawson_cash_43.webp"), // №43
                LootPoint(LootType.CASH_REGISTERS, 0.1456f, 0.6616f, photo = "lawson/lawson_cash_44.webp"), // №44
                LootPoint(LootType.CASH_REGISTERS, 0.6993f, 0.6692f, photo = "lawson/lawson_cash_45.webp"), // №45
                LootPoint(LootType.CASH_REGISTERS, 0.3492f, 0.6749f, photo = "lawson/lawson_cash_46.webp"), // №46
                LootPoint(LootType.CASH_REGISTERS, 0.8259f, 0.6902f, photo = "lawson/lawson_cash_47.webp"), // №47
                LootPoint(LootType.CASH_REGISTERS, 0.8287f, 0.7626f, photo = "lawson/lawson_cash_48.webp"), // №48
                LootPoint(LootType.CASH_REGISTERS, 0.8316f, 0.8046f, photo = "lawson/lawson_cash_49.webp"), // №49
                LootPoint(LootType.CASH_REGISTERS, 0.4443f, 0.8074f, photo = "lawson/lawson_cash_50.webp"), // №50
                LootPoint(LootType.CASH_REGISTERS, 0.6384f, 0.8074f, photo = "lawson/lawson_cash_51.webp"), // №51
                LootPoint(LootType.CASH_REGISTERS, 0.3654f, 0.8141f, photo = "lawson/lawson_cash_52.webp"), // №52
                LootPoint(LootType.CASH_REGISTERS, 0.6822f, 0.8151f, photo = "lawson/lawson_cash_53.webp"), // №53
                LootPoint(LootType.CASH_REGISTERS, 0.1960f, 0.8160f, photo = "lawson/lawson_cash_54.webp"), // №54
                LootPoint(LootType.CASH_REGISTERS, 0.8696f, 0.8246f, photo = "lawson/lawson_cash_55.webp"), // №55
                LootPoint(LootType.CASH_REGISTERS, 0.3996f, 0.8255f, photo = "lawson/lawson_cash_56.webp"), // №56
                LootPoint(LootType.CASH_REGISTERS, 0.6622f, 0.8313f, photo = "lawson/lawson_cash_57.webp"), // №57
                LootPoint(LootType.CASH_REGISTERS, 0.1751f, 0.8379f, photo = "lawson/lawson_cash_58.webp"), // №58
                LootPoint(LootType.CASH_REGISTERS, 0.2369f, 0.8570f, photo = "lawson/lawson_cash_59.webp"), // №59
                LootPoint(LootType.CASH_REGISTERS, 0.3834f, 0.8580f, photo = "lawson/lawson_cash_60.webp"), // №60
                LootPoint(LootType.CASH_REGISTERS, 0.4672f, 0.8761f, photo = "lawson/lawson_cash_61.webp"), // №61
                LootPoint(LootType.CASH_REGISTERS, 0.4481f, 0.2326f, photo = "lawson/lawson_cash_62.webp"), // №62
                LootPoint(LootType.CASH_REGISTERS, 0.7507f, 0.4414f, photo = "lawson/lawson_cash_63.webp"), // №63
                LootPoint(LootType.CASH_REGISTERS, 0.5290f, 0.4871f, photo = "lawson/lawson_cash_64.webp"), // №64
                LootPoint(LootType.CASH_REGISTERS, 0.3387f, 0.6835f, photo = "lawson/lawson_cash_66.webp"), // №66
                LootPoint(LootType.CASH_REGISTERS, 0.6499f, 0.7836f, photo = "lawson/lawson_cash_67.webp"), // №67
                LootPoint(LootType.CASH_REGISTERS, 0.4291f, 0.7989f, photo = "lawson/lawson_cash_68.webp"), // №68
                LootPoint(LootType.CASH_REGISTERS, x = 0.1370f, y = 0.3598f, photo = "lawson/lawson_cash_69.webp"), // №69
                LootPoint(LootType.CASH_REGISTERS, x = 0.6120f, y = 0.1543f, photo = "lawson/lawson_cash_70.webp"), // №70
                LootPoint(LootType.CASH_REGISTERS, x = 0.8355f, y = 0.2055f, photo = "lawson/lawson_cash_71.webp"), // №71
                LootPoint(LootType.CASH_REGISTERS, x = 0.7544f, y = 0.4218f, photo = "lawson/lawson_cash_72.webp"), // №72
                LootPoint(LootType.CASH_REGISTERS, x = 0.7058f, y = 0.6617f, photo = "lawson/lawson_cash_73.webp"), // №73
                LootPoint(LootType.CASH_REGISTERS, x = 0.7093f, y = 0.6542f, photo = "lawson/lawson_cash_74.webp"), // №74
                LootPoint(LootType.CASH_REGISTERS, x = 0.7189f, y = 0.6517f, photo = "lawson/lawson_cash_75.webp"), // №75
                LootPoint(LootType.CASH_REGISTERS, x = 0.6895f, y = 0.8075f, photo = "lawson/lawson_cash_76.webp"), // №76
                LootPoint(LootType.CASH_REGISTERS, x = 0.6490f, y = 0.8039f, photo = "lawson/lawson_cash_77.webp"), // №77
                LootPoint(LootType.CASH_REGISTERS, x = 0.3782f, y = 0.8615f, photo = "lawson/lawson_cash_78.webp"), // №78
                LootPoint(LootType.CASH_REGISTERS, x = 0.4401f, y = 0.8020f, photo = "lawson/lawson_cash_79.webp"), // №79
                LootPoint(LootType.CASH_REGISTERS, x = 0.4772f, y = 0.5729f, photo = "lawson/lawson_cash_80.webp"), // №80
                LootPoint(LootType.CASH_REGISTERS, x = 0.4775f, y = 0.5689f, photo = "lawson/lawson_cash_81.webp"), // №81

                // — Точки эвакуации: найдены автоматически по карте-источнику —
                LootPoint(LootType.EXTRACT_POINTS, 0.4854f, 0.0228f),
                LootPoint(LootType.EXTRACT_POINTS, 0.2375f, 0.0366f),
                LootPoint(LootType.EXTRACT_POINTS, 0.6953f, 0.0514f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9366f, 0.0790f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0413f, 0.1313f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9461f, 0.2193f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0693f, 0.3254f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9351f, 0.3549f),
                LootPoint(LootType.EXTRACT_POINTS, 0.5759f, 0.4110f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0394f, 0.4838f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9721f, 0.5580f),
                LootPoint(LootType.EXTRACT_POINTS, 0.5138f, 0.5814f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0295f, 0.6237f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9626f, 0.7474f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0228f, 0.7816f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9584f, 0.8535f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0669f, 0.9382f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9456f, 0.9548f),
                LootPoint(LootType.EXTRACT_POINTS, 0.2835f, 0.9610f),
                LootPoint(LootType.EXTRACT_POINTS, 0.5318f, 0.9781f),
                LootPoint(LootType.EXTRACT_POINTS, 0.8252f, 0.9791f),

                // — Точки спавна команды: найдены автоматически —
                LootPoint(LootType.TEAM_SPAWNS, 0.3291f, 0.0325f),
                LootPoint(LootType.TEAM_SPAWNS, 0.1532f, 0.0351f),
                LootPoint(LootType.TEAM_SPAWNS, 0.6628f, 0.0361f),
                LootPoint(LootType.TEAM_SPAWNS, 0.4917f, 0.0394f),
                LootPoint(LootType.TEAM_SPAWNS, 0.8251f, 0.0410f),
                LootPoint(LootType.TEAM_SPAWNS, 0.2295f, 0.0567f),
                LootPoint(LootType.TEAM_SPAWNS, 0.3828f, 0.0634f),
                LootPoint(LootType.TEAM_SPAWNS, 0.7560f, 0.0735f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9626f, 0.1448f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0251f, 0.2113f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9720f, 0.2855f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0442f, 0.2864f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0452f, 0.3883f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9471f, 0.4435f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0725f, 0.4902f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9616f, 0.5387f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0301f, 0.5864f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9707f, 0.6426f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0502f, 0.7239f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9648f, 0.8213f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0433f, 0.8446f),
                LootPoint(LootType.TEAM_SPAWNS, 0.3200f, 0.9471f),
                LootPoint(LootType.TEAM_SPAWNS, 0.8215f, 0.9582f),
                LootPoint(LootType.TEAM_SPAWNS, 0.6377f, 0.9651f),
                LootPoint(LootType.TEAM_SPAWNS, 0.1722f, 0.9695f),
                LootPoint(LootType.TEAM_SPAWNS, 0.4426f, 0.9771f),

                // — Точки снабжения
                LootPoint(LootType.SUPPLY_POINTS, x = 0.1901f, y = 0.6688f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.2326f, y = 0.6771f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5380f, y = 0.7488f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4743f, y = 0.6999f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5064f, y = 0.7048f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5515f, y = 0.6290f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6229f, y = 0.5946f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5620f, y = 0.5279f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6132f, y = 0.5224f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6636f, y = 0.4556f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5555f, y = 0.4044f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4668f, y = 0.4518f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6066f, y = 0.3183f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6227f, y = 0.3066f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5596f, y = 0.2356f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5005f, y = 0.1911f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3350f, y = 0.2168f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3237f, y = 0.2568f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3012f, y = 0.2913f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.2854f, y = 0.3843f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.8408f, y = 0.7256f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.8091f, y = 0.5347f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7232f, y = 0.4478f),

                // — Упавший шар
                LootPoint(LootType.FALLEN_BALL, x = 0.1927f, y = 0.7282f),
                LootPoint(LootType.FALLEN_BALL, x = 0.3208f, y = 0.4990f),
                LootPoint(LootType.FALLEN_BALL, x = 0.4378f, y = 0.4155f),
                LootPoint(LootType.FALLEN_BALL, x = 0.7275f, y = 0.4813f),
                LootPoint(LootType.FALLEN_BALL, x = 0.6575f, y = 0.7223f),
                LootPoint(LootType.FALLEN_BALL, x = 0.5792f, y = 0.8225f),

                // — Маленькая вышка
                LootPoint(LootType.SMALL_TOWER, x = 0.2123f, y = 0.4561f),
                LootPoint(LootType.SMALL_TOWER, x = 0.2368f, y = 0.4142f),
                LootPoint(LootType.SMALL_TOWER, x = 0.2864f, y = 0.5258f),
                LootPoint(LootType.SMALL_TOWER, x = 0.1638f, y = 0.1926f),
                LootPoint(LootType.SMALL_TOWER, x = 0.3532f, y = 0.1801f),
                LootPoint(LootType.SMALL_TOWER, x = 0.5464f, y = 0.1801f),
                LootPoint(LootType.SMALL_TOWER, x = 0.5445f, y = 0.3623f),
                LootPoint(LootType.SMALL_TOWER, x = 0.4378f, y = 0.4157f),
                LootPoint(LootType.SMALL_TOWER, x = 0.4950f, y = 0.7748f),
                LootPoint(LootType.SMALL_TOWER, x = 0.4815f, y = 0.9382f),
                LootPoint(LootType.SMALL_TOWER, x = 0.6618f, y = 0.9041f),
                LootPoint(LootType.SMALL_TOWER, x = 0.7517f, y = 0.8132f),
                LootPoint(LootType.SMALL_TOWER, x = 0.7776f, y = 0.7147f),
                LootPoint(LootType.SMALL_TOWER, x = 0.9502f, y = 0.8348f),
                LootPoint(LootType.SMALL_TOWER, x = 0.9242f, y = 0.6392f),
                LootPoint(LootType.SMALL_TOWER, x = 0.8863f, y = 0.4272f),
                LootPoint(LootType.SMALL_TOWER, x = 0.6507f, y = 0.3926f),
                LootPoint(LootType.SMALL_TOWER, x = 0.6786f, y = 0.2859f),
                LootPoint(LootType.SMALL_TOWER, x = 0.7377f, y = 0.1398f),

                // — Большая вышка
                LootPoint(LootType.BIG_TOWER, x = 0.4785f, y = 0.5697f),
                LootPoint(LootType.BIG_TOWER, x = 0.1416f, y = 0.3611f),

                // — Верстаки
                LootPoint(LootType.WORKBENCHES, x = 0.2077f, y = 0.8605f),
                LootPoint(LootType.WORKBENCHES, x = 0.1894f, y = 0.8475f),
                LootPoint(LootType.WORKBENCHES, x = 0.3773f, y = 0.8592f),
                LootPoint(LootType.WORKBENCHES, x = 0.6353f, y = 0.8054f),
                LootPoint(LootType.WORKBENCHES, x = 0.6499f, y = 0.7862f),
                LootPoint(LootType.WORKBENCHES, x = 0.6603f, y = 0.8229f),
                LootPoint(LootType.WORKBENCHES, x = 0.6801f, y = 0.8091f),
                LootPoint(LootType.WORKBENCHES, x = 0.6816f, y = 0.8106f),
                LootPoint(LootType.WORKBENCHES, x = 0.8465f, y = 0.8204f),
                LootPoint(LootType.WORKBENCHES, x = 0.9056f, y = 0.6069f),
                LootPoint(LootType.WORKBENCHES, x = 0.8698f, y = 0.5502f),
                LootPoint(LootType.WORKBENCHES, x = 0.7632f, y = 0.6222f),
                LootPoint(LootType.WORKBENCHES, x = 0.4010f, y = 0.6887f),
                LootPoint(LootType.WORKBENCHES, x = 0.3351f, y = 0.6553f),
                LootPoint(LootType.WORKBENCHES, x = 0.1295f, y = 0.6224f),
                LootPoint(LootType.WORKBENCHES, x = 0.1872f, y = 0.3977f),
                LootPoint(LootType.WORKBENCHES, x = 0.1220f, y = 0.1715f),
                LootPoint(LootType.WORKBENCHES, x = 0.1225f, y = 0.1182f),
                LootPoint(LootType.WORKBENCHES, x = 0.1596f, y = 0.1516f),
                LootPoint(LootType.WORKBENCHES, x = 0.3161f, y = 0.1458f),
                LootPoint(LootType.WORKBENCHES, x = 0.3278f, y = 0.1175f),
                LootPoint(LootType.WORKBENCHES, x = 0.4587f, y = 0.2462f),
                LootPoint(LootType.WORKBENCHES, x = 0.4381f, y = 0.2946f),
                LootPoint(LootType.WORKBENCHES, x = 0.4324f, y = 0.3070f),
                LootPoint(LootType.WORKBENCHES, x = 0.6128f, y = 0.2090f),
                LootPoint(LootType.WORKBENCHES, x = 0.6372f, y = 0.2004f),
                LootPoint(LootType.WORKBENCHES, x = 0.8498f, y = 0.2043f),
                LootPoint(LootType.WORKBENCHES, x = 0.8165f, y = 0.2958f),
                LootPoint(LootType.WORKBENCHES, x = 0.6987f, y = 0.3853f),
                LootPoint(LootType.WORKBENCHES, x = 0.7361f, y = 0.3661f),
                LootPoint(LootType.WORKBENCHES, x = 0.4931f, y = 0.4712f),
                LootPoint(LootType.WORKBENCHES, x = 0.5111f, y = 0.4473f),
                LootPoint(LootType.WORKBENCHES, x = 0.4592f, y = 0.1016f),
                LootPoint(LootType.WORKBENCHES, x = 0.4638f, y = 0.1095f)

            )
        ),

        GameMap(
            id = "mammon",
            name = "Распадок Маммоны",
            subtitle = "Каньон, городок и старатели",
            imageRes = R.drawable.map_mammon,
            locations = listOf(
                MapLocation("Двор Блэкторнов", x = 0.190f, y = 0.110f),
                MapLocation("Газовый завод", x = 0.455f, y = 0.120f),
                MapLocation("Конечная станция", x = 0.860f, y = 0.110f),
                MapLocation("Хмель Монтеро", x = 0.550f, y = 0.295f),
                MapLocation("Берлога гризли", x = 0.080f, y = 0.315f),
                MapLocation("Камни О'Донована", x = 0.400f, y = 0.440f),
                MapLocation("Ферма «Ист-маунтайн»", x = 0.790f, y = 0.365f),
                MapLocation("Мельница Сплит-ривер", x = 0.600f, y = 0.450f),
                MapLocation("Лесоповал Дедфолл", x = 0.220f, y = 0.555f),
                MapLocation("Шахта Ла Плата", x = 0.440f, y = 0.575f),
                MapLocation("Машинная теснина", x = 0.900f, y = 0.550f),
                MapLocation("Шахта Оро Гордо", x = 0.560f, y = 0.580f),
                MapLocation("Нефть Престона", x = 0.120f, y = 0.855f),
                MapLocation("Литейная Кингфишер", x = 0.410f, y = 0.865f),
                MapLocation("Майнерс-Фолли", x = 0.860f, y = 0.790f),
                MapLocation("Карьер Грейстоун", x = 0.640f, y = 0.840f)
            ),
            points = listOf(

                // — Точки эвакуации: найдены автоматически по карте-источнику —
                LootPoint(LootType.EXTRACT_POINTS, 0.3495f, 0.0227f),
                LootPoint(LootType.EXTRACT_POINTS, 0.7832f, 0.0227f),
                LootPoint(LootType.EXTRACT_POINTS, 0.6289f, 0.0256f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0332f, 0.0346f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9712f, 0.0942f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0176f, 0.2206f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9565f, 0.3087f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0285f, 0.4091f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9821f, 0.5009f),
                LootPoint(LootType.EXTRACT_POINTS, 0.3353f, 0.5426f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0171f, 0.5587f),
                LootPoint(LootType.EXTRACT_POINTS, 0.3628f, 0.6203f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9707f, 0.6818f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0143f, 0.7116f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9736f, 0.8011f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0181f, 0.8570f),
                LootPoint(LootType.EXTRACT_POINTS, 0.8860f, 0.9295f),
                LootPoint(LootType.EXTRACT_POINTS, 0.2491f, 0.9673f),
                LootPoint(LootType.EXTRACT_POINTS, 0.3760f, 0.9796f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0503f, 0.9811f),
                LootPoint(LootType.EXTRACT_POINTS, 0.7136f, 0.9882f),

                // — Точки спавна команды: найдены автоматически —
                LootPoint(LootType.TEAM_SPAWNS, 0.4220f, 0.0102f),
                LootPoint(LootType.TEAM_SPAWNS, 0.2082f, 0.0120f),
                LootPoint(LootType.TEAM_SPAWNS, 0.8182f, 0.0181f),
                LootPoint(LootType.TEAM_SPAWNS, 0.1075f, 0.0194f),
                LootPoint(LootType.TEAM_SPAWNS, 0.7333f, 0.0217f),
                LootPoint(LootType.TEAM_SPAWNS, 0.5777f, 0.0274f),
                LootPoint(LootType.TEAM_SPAWNS, 0.6576f, 0.0336f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9150f, 0.0391f),
                LootPoint(LootType.TEAM_SPAWNS, 0.3590f, 0.0402f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0488f, 0.0676f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9438f, 0.0900f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9286f, 0.1650f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9158f, 0.2084f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0363f, 0.2234f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0147f, 0.2963f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9017f, 0.3049f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0413f, 0.3741f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9124f, 0.3839f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0299f, 0.4348f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9588f, 0.4711f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0497f, 0.4992f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9835f, 0.5841f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0289f, 0.5916f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0288f, 0.6678f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9389f, 0.6709f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0372f, 0.7109f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9424f, 0.7330f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0365f, 0.7567f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9527f, 0.7973f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0355f, 0.8492f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9307f, 0.8816f),
                LootPoint(LootType.TEAM_SPAWNS, 0.8718f, 0.9109f),
                LootPoint(LootType.TEAM_SPAWNS, 0.7860f, 0.9262f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0701f, 0.9355f),
                LootPoint(LootType.TEAM_SPAWNS, 0.3608f, 0.9439f),
                LootPoint(LootType.TEAM_SPAWNS, 0.2756f, 0.9488f),
                LootPoint(LootType.TEAM_SPAWNS, 0.3045f, 0.9492f),
                LootPoint(LootType.TEAM_SPAWNS, 0.4531f, 0.9518f),
                LootPoint(LootType.TEAM_SPAWNS, 0.4086f, 0.9556f),
                LootPoint(LootType.TEAM_SPAWNS, 0.6998f, 0.9690f),
                LootPoint(LootType.TEAM_SPAWNS, 0.6672f, 0.9718f),
                LootPoint(LootType.TEAM_SPAWNS, 0.1389f, 0.9814f),

                LootPoint(LootType.CASH_REGISTERS, x = 0.1772f, y = 0.8076f, photo = "mammon/mammon_cash_1.webp"), // №1
                LootPoint(LootType.CASH_REGISTERS, x = 0.1247f, y = 0.8211f, photo = "mammon/mammon_cash_2.webp"), // №2
                LootPoint(LootType.CASH_REGISTERS, x = 0.1046f, y = 0.8703f, photo = "mammon/mammon_cash_3.webp"), // №3
                LootPoint(LootType.CASH_REGISTERS, x = 0.0829f, y = 0.8793f, photo = "mammon/mammon_cash_4.webp"), // №4
                LootPoint(LootType.CASH_REGISTERS, x = 0.1179f, y = 0.8953f, photo = "mammon/mammon_cash_5.webp"), // №5
                LootPoint(LootType.CASH_REGISTERS, x = 0.1282f, y = 0.8838f, photo = "mammon/mammon_cash_6.webp"), // №6
                LootPoint(LootType.CASH_REGISTERS, x = 0.1398f, y = 0.8962f, photo = "mammon/mammon_cash_7.webp"), // №7
                LootPoint(LootType.CASH_REGISTERS, x = 0.1393f, y = 0.9088f, photo = "mammon/mammon_cash_8.webp"), // №8
                LootPoint(LootType.CASH_REGISTERS, x = 0.1932f, y = 0.9039f, photo = "mammon/mammon_cash_9.webp"), // №9
                LootPoint(LootType.CASH_REGISTERS, x = 0.1924f, y = 0.8673f, photo = "mammon/mammon_cash_10.webp"), // №10
                LootPoint(LootType.CASH_REGISTERS, x = 0.1544f, y = 0.8606f, photo = "mammon/mammon_cash_11.webp"), // №11
                LootPoint(LootType.CASH_REGISTERS, x = 0.0464f, y = 0.7735f, photo = "mammon/mammon_cash_12.webp"), // №12
                LootPoint(LootType.CASH_REGISTERS, x = 0.2328f, y = 0.8221f, photo = "mammon/mammon_cash_13.webp"), // №13
                LootPoint(LootType.CASH_REGISTERS, x = 0.3721f, y = 0.8852f, photo = "mammon/mammon_cash_14.webp"), // №14
                LootPoint(LootType.CASH_REGISTERS, x = 0.4167f, y = 0.8439f, photo = "mammon/mammon_cash_15.webp"), // №15
                LootPoint(LootType.CASH_REGISTERS, x = 0.3979f, y = 0.8547f, photo = "mammon/mammon_cash_16.webp"), // №16
                LootPoint(LootType.CASH_REGISTERS, x = 0.4321f, y = 0.8584f, photo = "mammon/mammon_cash_17.webp"), // №17
                LootPoint(LootType.CASH_REGISTERS, x = 0.4578f, y = 0.8430f, photo = "mammon/mammon_cash_18.webp"), // №18
                LootPoint(LootType.CASH_REGISTERS, x = 0.4670f, y = 0.8258f, photo = "mammon/mammon_cash_19.webp"), // №19
                LootPoint(LootType.CASH_REGISTERS, x = 0.4192f, y = 0.8001f, photo = "mammon/mammon_cash_20.webp"), // №20
                LootPoint(LootType.CASH_REGISTERS, x = 0.4492f, y = 0.7911f, photo = "mammon/mammon_cash_21.webp"), // №21
                LootPoint(LootType.CASH_REGISTERS, x = 0.6510f, y = 0.8300f, photo = "mammon/mammon_cash_22.webp"), // №22
                LootPoint(LootType.CASH_REGISTERS, x = 0.6464f, y = 0.8755f, photo = "mammon/mammon_cash_23.webp"), // №23
                LootPoint(LootType.CASH_REGISTERS, x = 0.6581f, y = 0.8789f, photo = "mammon/mammon_cash_24.webp"), // №24
                LootPoint(LootType.CASH_REGISTERS, x = 0.6582f, y = 0.9085f, photo = "mammon/mammon_cash_25.webp"), // №25
                LootPoint(LootType.CASH_REGISTERS, x = 0.6855f, y = 0.8969f, photo = "mammon/mammon_cash_26.webp"), // №26
                LootPoint(LootType.CASH_REGISTERS, x = 0.6846f, y = 0.8819f, photo = "mammon/mammon_cash_27.webp"), // №27
                LootPoint(LootType.CASH_REGISTERS, x = 0.6210f, y = 0.8964f, photo = "mammon/mammon_cash_28.webp"), // №28
                LootPoint(LootType.CASH_REGISTERS, x = 0.7435f, y = 0.9593f, photo = "mammon/mammon_cash_29.webp"), // №29
                LootPoint(LootType.CASH_REGISTERS, x = 0.9400f, y = 0.9520f, photo = "mammon/mammon_cash_30.webp"), // №30
                LootPoint(LootType.CASH_REGISTERS, x = 0.8604f, y = 0.8093f, photo = "mammon/mammon_cash_31.webp"), // №31
                LootPoint(LootType.CASH_REGISTERS, x = 0.8751f, y = 0.7924f, photo = "mammon/mammon_cash_32.webp"), // №32
                LootPoint(LootType.CASH_REGISTERS, x = 0.8855f, y = 0.7812f, photo = "mammon/mammon_cash_33.webp"), // №33
                LootPoint(LootType.CASH_REGISTERS, x = 0.8435f, y = 0.7914f, photo = "mammon/mammon_cash_34.webp"), // №34
                LootPoint(LootType.CASH_REGISTERS, x = 0.8412f, y = 0.7779f, photo = "mammon/mammon_cash_35.webp"), // №35
                LootPoint(LootType.CASH_REGISTERS, x = 0.8428f, y = 0.7559f, photo = "mammon/mammon_cash_36.webp"), // №36
                LootPoint(LootType.CASH_REGISTERS, x = 0.8109f, y = 0.6824f, photo = "mammon/mammon_cash_37.webp"), // №37
                LootPoint(LootType.CASH_REGISTERS, x = 0.8169f, y = 0.6745f, photo = "mammon/mammon_cash_38.webp"), // №38
                LootPoint(LootType.CASH_REGISTERS, x = 0.7384f, y = 0.6983f, photo = "mammon/mammon_cash_39.webp"), // №39
                LootPoint(LootType.CASH_REGISTERS, x = 0.5923f, y = 0.6798f, photo = "mammon/mammon_cash_40.webp"), // №40
                LootPoint(LootType.CASH_REGISTERS, x = 0.5600f, y = 0.6759f, photo = "mammon/mammon_cash_41.webp"), // №41
                LootPoint(LootType.CASH_REGISTERS, x = 0.5676f, y = 0.6842f, photo = "mammon/mammon_cash_42.webp"), // №42
                LootPoint(LootType.CASH_REGISTERS, x = 0.5799f, y = 0.6515f, photo = "mammon/mammon_cash_43.webp"), // №43
                LootPoint(LootType.CASH_REGISTERS, x = 0.5643f, y = 0.6429f, photo = "mammon/mammon_cash_44.webp"), // №44
                LootPoint(LootType.CASH_REGISTERS, x = 0.5437f, y = 0.6209f, photo = "mammon/mammon_cash_45.webp"), // №45
                LootPoint(LootType.CASH_REGISTERS, x = 0.5229f, y = 0.6321f, photo = "mammon/mammon_cash_46.webp"), // №46
                LootPoint(LootType.CASH_REGISTERS, x = 0.5111f, y = 0.6312f, photo = "mammon/mammon_cash_47.webp"), // №47
                LootPoint(LootType.CASH_REGISTERS, x = 0.6525f, y = 0.5815f, photo = "mammon/mammon_cash_48.webp"), // №48
                LootPoint(LootType.CASH_REGISTERS, x = 0.6030f, y = 0.5519f, photo = "mammon/mammon_cash_49.webp"), // №49
                LootPoint(LootType.CASH_REGISTERS, x = 0.4848f, y = 0.6017f, photo = "mammon/mammon_cash_50.webp"), // №50
                LootPoint(LootType.CASH_REGISTERS, x = 0.4793f, y = 0.6386f, photo = "mammon/mammon_cash_51.webp"), // №51
                LootPoint(LootType.CASH_REGISTERS, x = 0.4304f, y = 0.6130f, photo = "mammon/mammon_cash_52.webp"), // №52
                LootPoint(LootType.CASH_REGISTERS, x = 0.4350f, y = 0.6152f, photo = "mammon/mammon_cash_53.webp"), // №53
                LootPoint(LootType.CASH_REGISTERS, x = 0.4469f, y = 0.6085f, photo = "mammon/mammon_cash_54.webp"), // №54
                LootPoint(LootType.CASH_REGISTERS, x = 0.4343f, y = 0.6033f, photo = "mammon/mammon_cash_55.webp"), // №55
                LootPoint(LootType.CASH_REGISTERS, x = 0.4368f, y = 0.5969f, photo = "mammon/mammon_cash_56.webp"), // №56
                LootPoint(LootType.CASH_REGISTERS, x = 0.4285f, y = 0.5926f, photo = "mammon/mammon_cash_57.webp"), // №57
                LootPoint(LootType.CASH_REGISTERS, x = 0.4413f, y = 0.5853f, photo = "mammon/mammon_cash_58.webp"), // №58
                LootPoint(LootType.CASH_REGISTERS, x = 0.4485f, y = 0.5781f, photo = "mammon/mammon_cash_59.webp"), // №59
                LootPoint(LootType.CASH_REGISTERS, x = 0.4490f, y = 0.5840f, photo = "mammon/mammon_cash_60.webp"), // №60
                LootPoint(LootType.CASH_REGISTERS, x = 0.4435f, y = 0.5690f, photo = "mammon/mammon_cash_61.webp"), // №61
                LootPoint(LootType.CASH_REGISTERS, x = 0.4264f, y = 0.5734f, photo = "mammon/mammon_cash_62.webp"), // №62
                LootPoint(LootType.CASH_REGISTERS, x = 0.4193f, y = 0.5634f, photo = "mammon/mammon_cash_63.webp"), // №63
                LootPoint(LootType.CASH_REGISTERS, x = 0.4100f, y = 0.5660f, photo = "mammon/mammon_cash_64.webp"), // №64
                LootPoint(LootType.CASH_REGISTERS, x = 0.4016f, y = 0.5891f, photo = "mammon/mammon_cash_65.webp"), // №65
                LootPoint(LootType.CASH_REGISTERS, x = 0.4135f, y = 0.5903f, photo = "mammon/mammon_cash_66.webp"), // №66
                LootPoint(LootType.CASH_REGISTERS, x = 0.2923f, y = 0.6254f, photo = "mammon/mammon_cash_67.webp"), // №67
                LootPoint(LootType.CASH_REGISTERS, x = 0.2506f, y = 0.5673f, photo = "mammon/mammon_cash_68.webp"), // №68
                LootPoint(LootType.CASH_REGISTERS, x = 0.1753f, y = 0.6435f, photo = "mammon/mammon_cash_69.webp"), // №69
                LootPoint(LootType.CASH_REGISTERS, x = 0.1224f, y = 0.6108f, photo = "mammon/mammon_cash_70.webp"), // №70
                LootPoint(LootType.CASH_REGISTERS, x = 0.1166f, y = 0.5933f, photo = "mammon/mammon_cash_71.webp"), // №71
                LootPoint(LootType.CASH_REGISTERS, x = 0.0963f, y = 0.6349f, photo = "mammon/mammon_cash_72.webp"), // №72
                LootPoint(LootType.CASH_REGISTERS, x = 0.1107f, y = 0.6287f, photo = "mammon/mammon_cash_73.webp"), // №73
                LootPoint(LootType.CASH_REGISTERS, x = 0.1089f, y = 0.6449f, photo = "mammon/mammon_cash_74.webp"), // №74
                LootPoint(LootType.CASH_REGISTERS, x = 0.1119f, y = 0.6398f, photo = "mammon/mammon_cash_75.webp"), // №75
                LootPoint(LootType.CASH_REGISTERS, x = 0.0902f, y = 0.6582f, photo = "mammon/mammon_cash_76.webp"), // №76
                LootPoint(LootType.CASH_REGISTERS, x = 0.0866f, y = 0.6138f, photo = "mammon/mammon_cash_77.webp"), // №77
                LootPoint(LootType.CASH_REGISTERS, x = 0.0799f, y = 0.5961f, photo = "mammon/mammon_cash_78.webp"), // №78
                LootPoint(LootType.CASH_REGISTERS, x = 0.0608f, y = 0.5003f, photo = "mammon/mammon_cash_79.webp"), // №79
                LootPoint(LootType.CASH_REGISTERS, x = 0.0875f, y = 0.3760f, photo = "mammon/mammon_cash_80.webp"), // №80
                LootPoint(LootType.CASH_REGISTERS, x = 0.0919f, y = 0.3768f, photo = "mammon/mammon_cash_81.webp"), // №81
                LootPoint(LootType.CASH_REGISTERS, x = 0.1102f, y = 0.3724f, photo = "mammon/mammon_cash_82.webp"), // №82
                LootPoint(LootType.CASH_REGISTERS, x = 0.1176f, y = 0.3542f, photo = "mammon/mammon_cash_83.webp"), // №83
                LootPoint(LootType.CASH_REGISTERS, x = 0.0933f, y = 0.3247f, photo = "mammon/mammon_cash_84.webp"), // №84
                LootPoint(LootType.CASH_REGISTERS, x = 0.0873f, y = 0.3341f, photo = "mammon/mammon_cash_85.webp"), // №85
                LootPoint(LootType.CASH_REGISTERS, x = 0.0823f, y = 0.3352f, photo = "mammon/mammon_cash_86.webp"), // №86
                LootPoint(LootType.CASH_REGISTERS, x = 0.0764f, y = 0.3329f, photo = "mammon/mammon_cash_87.webp"), // №87
                LootPoint(LootType.CASH_REGISTERS, x = 0.0779f, y = 0.3302f, photo = "mammon/mammon_cash_88.webp"), // №88
                LootPoint(LootType.CASH_REGISTERS, x = 0.0746f, y = 0.3298f, photo = "mammon/mammon_cash_89.webp"), // №89
                LootPoint(LootType.CASH_REGISTERS, x = 0.0698f, y = 0.3323f, photo = "mammon/mammon_cash_90.webp"), // №90
                LootPoint(LootType.CASH_REGISTERS, x = 0.0646f, y = 0.3301f, photo = "mammon/mammon_cash_91.webp"), // №91
                LootPoint(LootType.CASH_REGISTERS, x = 0.0690f, y = 0.3264f, photo = "mammon/mammon_cash_92.webp"), // №92
                LootPoint(LootType.CASH_REGISTERS, x = 0.0613f, y = 0.3153f, photo = "mammon/mammon_cash_93.webp"), // №93
                LootPoint(LootType.CASH_REGISTERS, x = 0.1104f, y = 0.2636f, photo = "mammon/mammon_cash_94.webp"), // №94
                LootPoint(LootType.CASH_REGISTERS, x = 0.0489f, y = 0.2584f, photo = "mammon/mammon_cash_95.webp"), // №95
                LootPoint(LootType.CASH_REGISTERS, x = 0.1071f, y = 0.2238f, photo = "mammon/mammon_cash_96.webp"), // №96
                LootPoint(LootType.CASH_REGISTERS, x = 0.1106f, y = 0.2268f, photo = "mammon/mammon_cash_97.webp"), // №97
                LootPoint(LootType.CASH_REGISTERS, x = 0.4596f, y = 0.5079f, photo = "mammon/mammon_cash_98.webp"), // №98
                LootPoint(LootType.CASH_REGISTERS, x = 0.4352f, y = 0.5000f, photo = "mammon/mammon_cash_99.webp"), // №99
                LootPoint(LootType.CASH_REGISTERS, x = 0.4345f, y = 0.4631f, photo = "mammon/mammon_cash_100.webp"), // №100
                LootPoint(LootType.CASH_REGISTERS, x = 0.3815f, y = 0.4687f, photo = "mammon/mammon_cash_101.webp"), // №101
                LootPoint(LootType.CASH_REGISTERS, x = 0.3877f, y = 0.4623f, photo = "mammon/mammon_cash_102.webp"), // №102
                LootPoint(LootType.CASH_REGISTERS, x = 0.3938f, y = 0.4436f, photo = "mammon/mammon_cash_103.webp"), // №103
                LootPoint(LootType.CASH_REGISTERS, x = 0.3511f, y = 0.4362f, photo = "mammon/mammon_cash_104.webp"), // №104
                LootPoint(LootType.CASH_REGISTERS, x = 0.3929f, y = 0.4106f, photo = "mammon/mammon_cash_105.webp"), // №105
                LootPoint(LootType.CASH_REGISTERS, x = 0.3898f, y = 0.4036f, photo = "mammon/mammon_cash_106.webp"), // №106
                LootPoint(LootType.CASH_REGISTERS, x = 0.3836f, y = 0.4092f, photo = "mammon/mammon_cash_107.webp"), // №107
                LootPoint(LootType.CASH_REGISTERS, x = 0.3890f, y = 0.4161f, photo = "mammon/mammon_cash_108.webp"), // №108
                LootPoint(LootType.CASH_REGISTERS, x = 0.3693f, y = 0.3922f, photo = "mammon/mammon_cash_109.webp"), // №109
                LootPoint(LootType.CASH_REGISTERS, x = 0.3324f, y = 0.3760f, photo = "mammon/mammon_cash_110.webp"), // №110
                LootPoint(LootType.CASH_REGISTERS, x = 0.3955f, y = 0.3879f, photo = "mammon/mammon_cash_111.webp"), // №111
                LootPoint(LootType.CASH_REGISTERS, x = 0.3990f, y = 0.3881f, photo = "mammon/mammon_cash_112.webp"), // №112
                LootPoint(LootType.CASH_REGISTERS, x = 0.4043f, y = 0.3866f, photo = "mammon/mammon_cash_113.webp"), // №113
                LootPoint(LootType.CASH_REGISTERS, x = 0.4081f, y = 0.3804f, photo = "mammon/mammon_cash_114.webp"), // №114
                LootPoint(LootType.CASH_REGISTERS, x = 0.3968f, y = 0.3744f, photo = "mammon/mammon_cash_115.webp"), // №115
                LootPoint(LootType.CASH_REGISTERS, x = 0.3949f, y = 0.3683f, photo = "mammon/mammon_cash_116.webp"), // №116
                LootPoint(LootType.CASH_REGISTERS, x = 0.3379f, y = 0.3307f, photo = "mammon/mammon_cash_117.webp"), // №117
                LootPoint(LootType.CASH_REGISTERS, x = 0.5822f, y = 0.4850f, photo = "mammon/mammon_cash_118.webp"), // №118
                LootPoint(LootType.CASH_REGISTERS, x = 0.5761f, y = 0.4642f, photo = "mammon/mammon_cash_119.webp"), // №119
                LootPoint(LootType.CASH_REGISTERS, x = 0.5971f, y = 0.4568f, photo = "mammon/mammon_cash_120.webp"), // №120
                LootPoint(LootType.CASH_REGISTERS, x = 0.6208f, y = 0.4715f, photo = "mammon/mammon_cash_121.webp"), // №121
                LootPoint(LootType.CASH_REGISTERS, x = 0.6390f, y = 0.4848f, photo = "mammon/mammon_cash_122.webp"), // №122
                LootPoint(LootType.CASH_REGISTERS, x = 0.6753f, y = 0.4687f, photo = "mammon/mammon_cash_123.webp"), // №123
                LootPoint(LootType.CASH_REGISTERS, x = 0.6402f, y = 0.4536f, photo = "mammon/mammon_cash_124.webp"), // №124
                LootPoint(LootType.CASH_REGISTERS, x = 0.7478f, y = 0.5099f, photo = "mammon/mammon_cash_125.webp"), // №125
                LootPoint(LootType.CASH_REGISTERS, x = 0.7904f, y = 0.4798f, photo = "mammon/mammon_cash_126.webp"), // №126
                LootPoint(LootType.CASH_REGISTERS, x = 0.8002f, y = 0.4791f, photo = "mammon/mammon_cash_127.webp"), // №127
                LootPoint(LootType.CASH_REGISTERS, x = 0.8346f, y = 0.5282f, photo = "mammon/mammon_cash_128.webp"), // №128
                LootPoint(LootType.CASH_REGISTERS, x = 0.8827f, y = 0.5741f, photo = "mammon/mammon_cash_129.webp"), // №129
                LootPoint(LootType.CASH_REGISTERS, x = 0.8817f, y = 0.6014f, photo = "mammon/mammon_cash_130.webp"), // №130
                LootPoint(LootType.CASH_REGISTERS, x = 0.8975f, y = 0.5856f, photo = "mammon/mammon_cash_131.webp"), // №131
                LootPoint(LootType.CASH_REGISTERS, x = 0.8981f, y = 0.5777f, photo = "mammon/mammon_cash_132.webp"), // №132
                LootPoint(LootType.CASH_REGISTERS, x = 0.9087f, y = 0.5814f, photo = "mammon/mammon_cash_133.webp"), // №133
                LootPoint(LootType.CASH_REGISTERS, x = 0.9184f, y = 0.5971f, photo = "mammon/mammon_cash_134.webp"), // №134
                LootPoint(LootType.CASH_REGISTERS, x = 0.8922f, y = 0.5347f, photo = "mammon/mammon_cash_135.webp"), // №135
                LootPoint(LootType.CASH_REGISTERS, x = 0.8877f, y = 0.5144f, photo = "mammon/mammon_cash_136.webp"), // №136
                LootPoint(LootType.CASH_REGISTERS, x = 0.7147f, y = 0.3272f, photo = "mammon/mammon_cash_137.webp"), // №137
                LootPoint(LootType.CASH_REGISTERS, x = 0.7445f, y = 0.3258f, photo = "mammon/mammon_cash_138.webp"), // №138
                LootPoint(LootType.CASH_REGISTERS, x = 0.7483f, y = 0.3453f, photo = "mammon/mammon_cash_139.webp"), // №139
                LootPoint(LootType.CASH_REGISTERS, x = 0.7911f, y = 0.3406f, photo = "mammon/mammon_cash_140.webp"), // №140
                LootPoint(LootType.CASH_REGISTERS, x = 0.7916f, y = 0.3721f, photo = "mammon/mammon_cash_141.webp"), // №141
                LootPoint(LootType.CASH_REGISTERS, x = 0.7071f, y = 0.3517f, photo = "mammon/mammon_cash_142.webp"), // №142
                LootPoint(LootType.CASH_REGISTERS, x = 0.7027f, y = 0.3596f, photo = "mammon/mammon_cash_143.webp"), // №143
                LootPoint(LootType.CASH_REGISTERS, x = 0.7010f, y = 0.3416f, photo = "mammon/mammon_cash_144.webp"), // №144
                LootPoint(LootType.CASH_REGISTERS, x = 0.8433f, y = 0.2852f, photo = "mammon/mammon_cash_145.webp"), // №145
                LootPoint(LootType.CASH_REGISTERS, x = 0.9116f, y = 0.1636f, photo = "mammon/mammon_cash_146.webp"), // №146
                LootPoint(LootType.CASH_REGISTERS, x = 0.8720f, y = 0.1272f, photo = "mammon/mammon_cash_147.webp"), // №147
                LootPoint(LootType.CASH_REGISTERS, x = 0.8764f, y = 0.1217f, photo = "mammon/mammon_cash_148.webp"), // №148
                LootPoint(LootType.CASH_REGISTERS, x = 0.8832f, y = 0.0963f, photo = "mammon/mammon_cash_149.webp"), // №149
                LootPoint(LootType.CASH_REGISTERS, x = 0.8590f, y = 0.0786f, photo = "mammon/mammon_cash_150.webp"), // №150
                LootPoint(LootType.CASH_REGISTERS, x = 0.8557f, y = 0.0889f, photo = "mammon/mammon_cash_151.webp"), // №151
                LootPoint(LootType.CASH_REGISTERS, x = 0.8960f, y = 0.0696f, photo = "mammon/mammon_cash_152.webp"), // №152
                LootPoint(LootType.CASH_REGISTERS, x = 0.8389f, y = 0.1374f, photo = "mammon/mammon_cash_153.webp"), // №153
                LootPoint(LootType.CASH_REGISTERS, x = 0.8364f, y = 0.1646f, photo = "mammon/mammon_cash_154.webp"), // №154
                LootPoint(LootType.CASH_REGISTERS, x = 0.8138f, y = 0.1395f, photo = "mammon/mammon_cash_155.webp"), // №155
                LootPoint(LootType.CASH_REGISTERS, x = 0.8269f, y = 0.1272f, photo = "mammon/mammon_cash_156.webp"), // №156
                LootPoint(LootType.CASH_REGISTERS, x = 0.8064f, y = 0.1239f, photo = "mammon/mammon_cash_157.webp"), // №157
                LootPoint(LootType.CASH_REGISTERS, x = 0.8232f, y = 0.1116f, photo = "mammon/mammon_cash_158.webp"), // №158
                LootPoint(LootType.CASH_REGISTERS, x = 0.8251f, y = 0.0830f, photo = "mammon/mammon_cash_159.webp"), // №159
                LootPoint(LootType.CASH_REGISTERS, x = 0.7855f, y = 0.1097f, photo = "mammon/mammon_cash_160.webp"), // №160
                LootPoint(LootType.CASH_REGISTERS, x = 0.7145f, y = 0.2143f, photo = "mammon/mammon_cash_161.webp"), // №161
                LootPoint(LootType.CASH_REGISTERS, x = 0.6795f, y = 0.0769f, photo = "mammon/mammon_cash_162.webp"), // №162
                LootPoint(LootType.CASH_REGISTERS, x = 0.5960f, y = 0.0707f, photo = "mammon/mammon_cash_163.webp"), // №163
                LootPoint(LootType.CASH_REGISTERS, x = 0.5301f, y = 0.0824f, photo = "mammon/mammon_cash_164.webp"), // №164
                LootPoint(LootType.CASH_REGISTERS, x = 0.5316f, y = 0.1171f, photo = "mammon/mammon_cash_165.webp"), // №165
                LootPoint(LootType.CASH_REGISTERS, x = 0.5120f, y = 0.0539f, photo = "mammon/mammon_cash_166.webp"), // №166
                LootPoint(LootType.CASH_REGISTERS, x = 0.4863f, y = 0.0467f, photo = "mammon/mammon_cash_167.webp"), // №167
                LootPoint(LootType.CASH_REGISTERS, x = 0.5051f, y = 0.1004f, photo = "mammon/mammon_cash_168.webp"), // №168
                LootPoint(LootType.CASH_REGISTERS, x = 0.4316f, y = 0.0828f, photo = "mammon/mammon_cash_169.webp"), // №169
                LootPoint(LootType.CASH_REGISTERS, x = 0.4466f, y = 0.1554f, photo = "mammon/mammon_cash_170.webp"), // №170
                LootPoint(LootType.CASH_REGISTERS, x = 0.3317f, y = 0.0733f, photo = "mammon/mammon_cash_171.webp"), // №171
                LootPoint(LootType.CASH_REGISTERS, x = 0.3024f, y = 0.0671f, photo = "mammon/mammon_cash_172.webp"), // №172
                LootPoint(LootType.CASH_REGISTERS, x = 0.2923f, y = 0.0759f, photo = "mammon/mammon_cash_173.webp"), // №173
                LootPoint(LootType.CASH_REGISTERS, x = 0.2713f, y = 0.1168f, photo = "mammon/mammon_cash_174.webp"), // №174
                LootPoint(LootType.CASH_REGISTERS, x = 0.2740f, y = 0.0473f, photo = "mammon/mammon_cash_175.webp"), // №175
                LootPoint(LootType.CASH_REGISTERS, x = 0.2310f, y = 0.0423f, photo = "mammon/mammon_cash_176.webp"), // №176
                LootPoint(LootType.CASH_REGISTERS, x = 0.2095f, y = 0.0491f, photo = "mammon/mammon_cash_177.webp"), // №177
                LootPoint(LootType.CASH_REGISTERS, x = 0.1829f, y = 0.0179f, photo = "mammon/mammon_cash_178.webp"), // №178
                LootPoint(LootType.CASH_REGISTERS, x = 0.1530f, y = 0.0577f, photo = "mammon/mammon_cash_179.webp"), // №179
                LootPoint(LootType.CASH_REGISTERS, x = 0.1393f, y = 0.0510f, photo = "mammon/mammon_cash_180.webp"), // №180
                LootPoint(LootType.CASH_REGISTERS, x = 0.1327f, y = 0.0305f, photo = "mammon/mammon_cash_181.webp"), // №181
                LootPoint(LootType.CASH_REGISTERS, x = 0.1119f, y = 0.0144f, photo = "mammon/mammon_cash_182.webp"), // №182
                LootPoint(LootType.CASH_REGISTERS, x = 0.1222f, y = 0.1374f, photo = "mammon/mammon_cash_183.webp"), // №183
                LootPoint(LootType.CASH_REGISTERS, x = 0.1544f, y = 0.1270f, photo = "mammon/mammon_cash_184.webp"), // №184
                LootPoint(LootType.CASH_REGISTERS, x = 0.1585f, y = 0.1097f, photo = "mammon/mammon_cash_185.webp"), // №185
                LootPoint(LootType.CASH_REGISTERS, x = 0.1673f, y = 0.1185f, photo = "mammon/mammon_cash_186.webp"), // №186
                LootPoint(LootType.CASH_REGISTERS, x = 0.1882f, y = 0.1364f, photo = "mammon/mammon_cash_187.webp"), // №187
                LootPoint(LootType.CASH_REGISTERS, x = 0.4526f, y = 0.2370f, photo = "mammon/mammon_cash_188.webp"), // №188
                LootPoint(LootType.CASH_REGISTERS, x = 0.4209f, y = 0.2453f, photo = "mammon/mammon_cash_189.webp"), // №189
                LootPoint(LootType.CASH_REGISTERS, x = 0.4760f, y = 0.2787f, photo = "mammon/mammon_cash_190.webp"), // №190
                LootPoint(LootType.CASH_REGISTERS, x = 0.5001f, y = 0.2842f, photo = "mammon/mammon_cash_191.webp"), // №191
                LootPoint(LootType.CASH_REGISTERS, x = 0.5238f, y = 0.2944f, photo = "mammon/mammon_cash_192.webp"), // №192
                LootPoint(LootType.CASH_REGISTERS, x = 0.5110f, y = 0.3300f, photo = "mammon/mammon_cash_193.webp"), // №193
                LootPoint(LootType.CASH_REGISTERS, x = 0.5516f, y = 0.3143f, photo = "mammon/mammon_cash_194.webp"), // №194
                LootPoint(LootType.CASH_REGISTERS, x = 0.5272f, y = 0.2821f, photo = "mammon/mammon_cash_195.webp"), // №195
                LootPoint(LootType.CASH_REGISTERS, x = 0.5306f, y = 0.2707f, photo = "mammon/mammon_cash_196.webp"), // №196
                LootPoint(LootType.CASH_REGISTERS, x = 0.5123f, y = 0.2655f, photo = "mammon/mammon_cash_197.webp"), // №197
                LootPoint(LootType.CASH_REGISTERS, x = 0.5169f, y = 0.2693f, photo = "mammon/mammon_cash_198.webp"), // №198
                LootPoint(LootType.CASH_REGISTERS, x = 0.4806f, y = 0.2634f, photo = "mammon/mammon_cash_199.webp"), // №199
                LootPoint(LootType.CASH_REGISTERS, x = 0.4853f, y = 0.2570f, photo = "mammon/mammon_cash_200.webp"), // №200
                LootPoint(LootType.CASH_REGISTERS, x = 0.4905f, y = 0.2430f, photo = "mammon/mammon_cash_201.webp"), // №201
                LootPoint(LootType.CASH_REGISTERS, x = 0.4999f, y = 0.2565f, photo = "mammon/mammon_cash_202.webp"), // №202
                LootPoint(LootType.CASH_REGISTERS, x = 0.5425f, y = 0.2556f, photo = "mammon/mammon_cash_203.webp"), // №203
                LootPoint(LootType.CASH_REGISTERS, x = 0.5713f, y = 0.2704f, photo = "mammon/mammon_cash_204.webp"), // №204
                LootPoint(LootType.CASH_REGISTERS, x = 0.8910f, y = 0.7656f, photo = "mammon/mammon_cash_205.webp"), // №205

                // — Точки снабжения
                LootPoint(LootType.SUPPLY_POINTS, x = 0.2869f, y = 0.4218f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.2587f, y = 0.4860f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3391f, y = 0.5346f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.2157f, y = 0.5239f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.1851f, y = 0.5678f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.2096f, y = 0.4235f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3354f, y = 0.6384f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.2340f, y = 0.7349f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3780f, y = 0.7351f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4423f, y = 0.7221f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4549f, y = 0.7562f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5206f, y = 0.8038f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6154f, y = 0.8256f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6430f, y = 0.7176f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6145f, y = 0.7077f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6891f, y = 0.6740f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6742f, y = 0.6551f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6672f, y = 0.5750f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6701f, y = 0.5761f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7065f, y = 0.7774f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7851f, y = 0.5983f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7848f, y = 0.5957f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7799f, y = 0.4784f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6951f, y = 0.4287f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5879f, y = 0.4219f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5223f, y = 0.3429f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6192f, y = 0.2646f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6149f, y = 0.1918f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4415f, y = 0.2115f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4156f, y = 0.1829f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3831f, y = 0.2310f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3826f, y = 0.2339f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3403f, y = 0.3127f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3401f, y = 0.3149f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3091f, y = 0.3436f),

                // — Упавший шар
                LootPoint(LootType.FALLEN_BALL, x = 0.2822f, y = 0.7974f),
                LootPoint(LootType.FALLEN_BALL, x = 0.2949f, y = 0.2688f),
                LootPoint(LootType.FALLEN_BALL, x = 0.1776f, y = 0.4798f),
                LootPoint(LootType.FALLEN_BALL, x = 0.5761f, y = 0.7810f),
                LootPoint(LootType.FALLEN_BALL, x = 0.7932f, y = 0.4615f),
                LootPoint(LootType.FALLEN_BALL, x = 0.7656f, y = 0.1652f),

                // — Маленькая вышка
                LootPoint(LootType.SMALL_TOWER, x = 0.7655f, y = 0.1657f),
                LootPoint(LootType.SMALL_TOWER, x = 0.6376f, y = 0.2562f),
                LootPoint(LootType.SMALL_TOWER, x = 0.6565f, y = 0.4136f),

                // — Большая вышка
                LootPoint(LootType.BIG_TOWER, x = 0.3165f, y = 0.6302f),
                LootPoint(LootType.BIG_TOWER, x = 0.1095f, y = 0.2240f),

                // — Верстаки
                LootPoint(LootType.WORKBENCHES, x = 0.1423f, y = 0.8820f),
                LootPoint(LootType.WORKBENCHES, x = 0.1266f, y = 0.8347f),
                LootPoint(LootType.WORKBENCHES, x = 0.3662f, y = 0.8812f),
                LootPoint(LootType.WORKBENCHES, x = 0.4581f, y = 0.8443f),
                LootPoint(LootType.WORKBENCHES, x = 0.4182f, y = 0.8016f),
                LootPoint(LootType.WORKBENCHES, x = 0.6626f, y = 0.9103f),
                LootPoint(LootType.WORKBENCHES, x = 0.6489f, y = 0.8759f),
                LootPoint(LootType.WORKBENCHES, x = 0.8499f, y = 0.7785f),
                LootPoint(LootType.WORKBENCHES, x = 0.8938f, y = 0.7685f),
                LootPoint(LootType.WORKBENCHES, x = 0.6348f, y = 0.6480f),
                LootPoint(LootType.WORKBENCHES, x = 0.6514f, y = 0.6092f),
                LootPoint(LootType.WORKBENCHES, x = 0.5772f, y = 0.6278f),
                LootPoint(LootType.WORKBENCHES, x = 0.5337f, y = 0.6287f),
                LootPoint(LootType.WORKBENCHES, x = 0.5112f, y = 0.6308f),
                LootPoint(LootType.WORKBENCHES, x = 0.4264f, y = 0.5965f),
                LootPoint(LootType.WORKBENCHES, x = 0.4233f, y = 0.5717f),
                LootPoint(LootType.WORKBENCHES, x = 0.2197f, y = 0.5941f),
                LootPoint(LootType.WORKBENCHES, x = 0.0759f, y = 0.5962f),
                LootPoint(LootType.WORKBENCHES, x = 0.1228f, y = 0.6306f),
                LootPoint(LootType.WORKBENCHES, x = 0.0940f, y = 0.3698f),
                LootPoint(LootType.WORKBENCHES, x = 0.3774f, y = 0.3993f),
                LootPoint(LootType.WORKBENCHES, x = 0.3940f, y = 0.3862f),
                LootPoint(LootType.WORKBENCHES, x = 0.1258f, y = 0.1238f),
                LootPoint(LootType.WORKBENCHES, x = 0.1631f, y = 0.0979f),
                LootPoint(LootType.WORKBENCHES, x = 0.1794f, y = 0.0928f),
                LootPoint(LootType.WORKBENCHES, x = 0.4410f, y = 0.0938f),
                LootPoint(LootType.WORKBENCHES, x = 0.4472f, y = 0.1584f),
                LootPoint(LootType.WORKBENCHES, x = 0.5106f, y = 0.0837f),
                LootPoint(LootType.WORKBENCHES, x = 0.5360f, y = 0.0839f),
                LootPoint(LootType.WORKBENCHES, x = 0.4852f, y = 0.0255f),
                LootPoint(LootType.WORKBENCHES, x = 0.5290f, y = 0.2467f),
                LootPoint(LootType.WORKBENCHES, x = 0.5095f, y = 0.2690f),
                LootPoint(LootType.WORKBENCHES, x = 0.5268f, y = 0.2956f),
                LootPoint(LootType.WORKBENCHES, x = 0.8255f, y = 0.0938f),
                LootPoint(LootType.WORKBENCHES, x = 0.7806f, y = 0.3503f),
                LootPoint(LootType.WORKBENCHES, x = 0.6846f, y = 0.3763f),
                LootPoint(LootType.WORKBENCHES, x = 0.5863f, y = 0.4874f),
                LootPoint(LootType.WORKBENCHES, x = 0.7969f, y = 0.4810f),


            )
        ),

        GameMap(
            id = "desalle",
            name = "Де-Салль",
            subtitle = "Усадьбы, мельницы и леса",
            imageRes = R.drawable.map_desalle,
            locations = listOf(
                MapLocation("Шахта Пестрой Змеи", x = 0.120f, y = 0.185f),
                MapLocation("Угольная компания Стэнли", x = 0.350f, y = 0.130f),
                MapLocation("Племенные свиньи", x = 0.615f, y = 0.185f),
                MapLocation("Плантация «Перл-Ривер»", x = 0.800f, y = 0.145f),
                MapLocation("Мельница «Плачущий камень»", x = 0.460f, y = 0.325f),
                MapLocation("Лесозаготовка «Эш-Крик»", x = 0.740f, y = 0.360f),
                MapLocation("Цеплята Мозеса", x = 0.220f, y = 0.440f),
                MapLocation("Приречное рыбное хозяйство", x = 0.530f, y = 0.530f),
                MapLocation("Поместье семи сестер", x = 0.185f, y = 0.625f),
                MapLocation("Тюрьма на Пеликаньем острове", x = 0.360f, y = 0.600f),
                MapLocation("Церковь Первого Откровения", x = 0.690f, y = 0.615f),
                MapLocation("Верхний Де-Салль", x = 0.880f, y = 0.625f),
                MapLocation("Форт Болден", x = 0.200f, y = 0.805f),
                MapLocation("Карьер Ривзов", x = 0.615f, y = 0.790f),
                MapLocation("Верфь Дэрина", x = 0.425f, y = 0.850f),
                MapLocation("Нижний Де-Салль", x = 0.860f, y = 0.780f)
            ),
            points = listOf(


                // — Точки эвакуации: найдены автоматически по карте-источнику —
                LootPoint(LootType.EXTRACT_POINTS, 0.4944f, 0.0203f),
                LootPoint(LootType.EXTRACT_POINTS, 0.6258f, 0.0217f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9155f, 0.0245f),
                LootPoint(LootType.EXTRACT_POINTS, 0.2245f, 0.0274f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0303f, 0.1354f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9769f, 0.1434f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9547f, 0.3486f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0237f, 0.3519f),
                LootPoint(LootType.EXTRACT_POINTS, 0.5681f, 0.4467f),
                LootPoint(LootType.EXTRACT_POINTS, 0.2874f, 0.5057f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0218f, 0.5175f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9868f, 0.5557f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0171f, 0.6288f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9727f, 0.6811f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0218f, 0.7750f),
                LootPoint(LootType.EXTRACT_POINTS, 0.0402f, 0.8802f),
                LootPoint(LootType.EXTRACT_POINTS, 0.9396f, 0.9028f),
                LootPoint(LootType.EXTRACT_POINTS, 0.4897f, 0.9745f),
                LootPoint(LootType.EXTRACT_POINTS, 0.1768f, 0.9759f),
                LootPoint(LootType.EXTRACT_POINTS, 0.2841f, 0.9764f),
                LootPoint(LootType.EXTRACT_POINTS, 0.8181f, 0.9788f),
                LootPoint(LootType.EXTRACT_POINTS, 0.6107f, 0.9792f),

                // — Верстаки
                LootPoint(LootType.WORKBENCHES, x = 0.1617f, y = 0.7978f),
                LootPoint(LootType.WORKBENCHES, x = 0.2450f, y = 0.8417f),
                LootPoint(LootType.WORKBENCHES, x = 0.3716f, y = 0.8381f),
                LootPoint(LootType.WORKBENCHES, x = 0.4107f, y = 0.8474f),
                LootPoint(LootType.WORKBENCHES, x = 0.6435f, y = 0.8319f),
                LootPoint(LootType.WORKBENCHES, x = 0.6475f, y = 0.8430f),
                LootPoint(LootType.WORKBENCHES, x = 0.8288f, y = 0.7785f),
                LootPoint(LootType.WORKBENCHES, x = 0.8556f, y = 0.8221f),
                LootPoint(LootType.WORKBENCHES, x = 0.8771f, y = 0.7526f),
                LootPoint(LootType.WORKBENCHES, x = 0.8806f, y = 0.6072f),
                LootPoint(LootType.WORKBENCHES, x = 0.8213f, y = 0.5386f),
                LootPoint(LootType.WORKBENCHES, x = 0.7222f, y = 0.5125f),
                LootPoint(LootType.WORKBENCHES, x = 0.7076f, y = 0.4195f),
                LootPoint(LootType.WORKBENCHES, x = 0.7050f, y = 0.3740f),
                LootPoint(LootType.WORKBENCHES, x = 0.7889f, y = 0.1074f),
                LootPoint(LootType.WORKBENCHES, x = 0.7298f, y = 0.0907f),
                LootPoint(LootType.WORKBENCHES, x = 0.6243f, y = 0.2019f),
                LootPoint(LootType.WORKBENCHES, x = 0.3281f, y = 0.1518f),
                LootPoint(LootType.WORKBENCHES, x = 0.3542f, y = 0.1056f),
                LootPoint(LootType.WORKBENCHES, x = 0.1900f, y = 0.1913f),
                LootPoint(LootType.WORKBENCHES, x = 0.1434f, y = 0.2485f),
                LootPoint(LootType.WORKBENCHES, x = 0.1560f, y = 0.4142f),
                LootPoint(LootType.WORKBENCHES, x = 0.1325f, y = 0.4450f),
                LootPoint(LootType.WORKBENCHES, x = 0.1119f, y = 0.6683f),
                LootPoint(LootType.WORKBENCHES, x = 0.3682f, y = 0.6800f),
                LootPoint(LootType.WORKBENCHES, x = 0.5127f, y = 0.5281f),
                LootPoint(LootType.WORKBENCHES, x = 0.5184f, y = 0.5348f),
                LootPoint(LootType.WORKBENCHES, x = 0.4546f, y = 0.3844f),
                LootPoint(LootType.WORKBENCHES, x = 0.4316f, y = 0.3092f),
                LootPoint(LootType.WORKBENCHES, x = 0.6935f, y = 0.6558f),

                // — Большая вышка
                LootPoint(LootType.BIG_TOWER, x = 0.3647f, y = 0.5487f),
                LootPoint(LootType.BIG_TOWER, x = 0.5199f, y = 0.3843f),
                LootPoint(LootType.BIG_TOWER, x = 0.6843f, y = 0.0961f),
                LootPoint(LootType.BIG_TOWER, x = 0.7984f, y = 0.3165f),

                // — Маленькая вышка
                LootPoint(LootType.SMALL_TOWER, x = 0.0360f, y = 0.5565f),
                LootPoint(LootType.SMALL_TOWER, x = 0.1223f, y = 0.3699f),
                LootPoint(LootType.SMALL_TOWER, x = 0.3003f, y = 0.3957f),
                LootPoint(LootType.SMALL_TOWER, x = 0.4082f, y = 0.1557f),
                LootPoint(LootType.SMALL_TOWER, x = 0.3518f, y = 0.0365f),
                LootPoint(LootType.SMALL_TOWER, x = 0.5203f, y = 0.0834f),
                LootPoint(LootType.SMALL_TOWER, x = 0.8475f, y = 0.5057f),
                LootPoint(LootType.SMALL_TOWER, x = 0.9360f, y = 0.4824f),
                LootPoint(LootType.SMALL_TOWER, x = 0.9299f, y = 0.6727f),
                LootPoint(LootType.SMALL_TOWER, x = 0.7525f, y = 0.8420f),
                LootPoint(LootType.SMALL_TOWER, x = 0.7082f, y = 0.7345f),
                LootPoint(LootType.SMALL_TOWER, x = 0.2797f, y = 0.8907f),
                LootPoint(LootType.SMALL_TOWER, x = 0.3129f, y = 0.6616f),

                // — Точки спавна команды: найдены автоматически —
                LootPoint(LootType.TEAM_SPAWNS, 0.3090f, 0.0125f),
                LootPoint(LootType.TEAM_SPAWNS, 0.6513f, 0.0353f),
                LootPoint(LootType.TEAM_SPAWNS, 0.4874f, 0.0457f),
                LootPoint(LootType.TEAM_SPAWNS, 0.8035f, 0.0499f),
                LootPoint(LootType.TEAM_SPAWNS, 0.5714f, 0.0505f),
                LootPoint(LootType.TEAM_SPAWNS, 0.7002f, 0.0570f),
                LootPoint(LootType.TEAM_SPAWNS, 0.1729f, 0.0692f),
                LootPoint(LootType.TEAM_SPAWNS, 0.8748f, 0.0757f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0771f, 0.0982f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0561f, 0.1490f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9154f, 0.1759f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0372f, 0.2621f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9055f, 0.2991f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0613f, 0.3396f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9307f, 0.3745f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0509f, 0.4189f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9536f, 0.4643f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0490f, 0.5126f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9694f, 0.5509f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0110f, 0.5897f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9721f, 0.6475f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0362f, 0.7049f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9623f, 0.7338f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0481f, 0.7907f),
                LootPoint(LootType.TEAM_SPAWNS, 0.9649f, 0.8303f),
                LootPoint(LootType.TEAM_SPAWNS, 0.0637f, 0.8559f),
                LootPoint(LootType.TEAM_SPAWNS, 0.8816f, 0.9125f),
                LootPoint(LootType.TEAM_SPAWNS, 0.1060f, 0.9148f),
                LootPoint(LootType.TEAM_SPAWNS, 0.3125f, 0.9302f),
                LootPoint(LootType.TEAM_SPAWNS, 0.8217f, 0.9400f),
                LootPoint(LootType.TEAM_SPAWNS, 0.1831f, 0.9537f),
                LootPoint(LootType.TEAM_SPAWNS, 0.2849f, 0.9548f),
                LootPoint(LootType.TEAM_SPAWNS, 0.6018f, 0.9580f),
                LootPoint(LootType.TEAM_SPAWNS, 0.4683f, 0.9611f),
                LootPoint(LootType.TEAM_SPAWNS, 0.6835f, 0.9647f),

                
                LootPoint(LootType.CASH_REGISTERS, x = 0.1504f, y = 0.8276f, photo = "desalle/desalle_cash_3.webp"), // №3
                LootPoint(LootType.CASH_REGISTERS, x = 0.1586f, y = 0.8062f, photo = "desalle/desalle_cash_4.webp"), // №4
                LootPoint(LootType.CASH_REGISTERS, x = 0.1753f, y = 0.7990f, photo = "desalle/desalle_cash_5.webp"), // №5
                LootPoint(LootType.CASH_REGISTERS, x = 0.1864f, y = 0.8098f, photo = "desalle/desalle_cash_6.webp"), // №6
                LootPoint(LootType.CASH_REGISTERS, x = 0.1906f, y = 0.8118f, photo = "desalle/desalle_cash_7.webp"), // №7
                LootPoint(LootType.CASH_REGISTERS, x = 0.1831f, y = 0.8340f, photo = "desalle/desalle_cash_8.webp"), // №8
                LootPoint(LootType.CASH_REGISTERS, x = 0.2124f, y = 0.8453f, photo = "desalle/desalle_cash_9.webp"), // №9
                LootPoint(LootType.CASH_REGISTERS, x = 0.2347f, y = 0.8219f, photo = "desalle/desalle_cash_10.webp"), // №10
                LootPoint(LootType.CASH_REGISTERS, x = 0.2220f, y = 0.8013f, photo = "desalle/desalle_cash_11.webp"), // №11
                LootPoint(LootType.CASH_REGISTERS, x = 0.2123f, y = 0.7961f, photo = "desalle/desalle_cash_12.webp"), // №12
                LootPoint(LootType.CASH_REGISTERS, x = 0.2492f, y = 0.8268f, photo = "desalle/desalle_cash_13.webp"), // №13
                LootPoint(LootType.CASH_REGISTERS, x = 0.2452f, y = 0.8425f, photo = "desalle/desalle_cash_14.webp"), // №14
                LootPoint(LootType.CASH_REGISTERS, x = 0.3708f, y = 0.8460f, photo = "desalle/desalle_cash_15.webp"), // №15
                LootPoint(LootType.CASH_REGISTERS, x = 0.3890f, y = 0.8987f, photo = "desalle/desalle_cash_16.webp"), // №16
                LootPoint(LootType.CASH_REGISTERS, x = 0.4228f, y = 0.8464f, photo = "desalle/desalle_cash_17.webp"), // №17
                LootPoint(LootType.CASH_REGISTERS, x = 0.4421f, y = 0.8407f, photo = "desalle/desalle_cash_18.webp"), // №18
                LootPoint(LootType.CASH_REGISTERS, x = 0.4592f, y = 0.8699f, photo = "desalle/desalle_cash_19.webp"), // №19
                LootPoint(LootType.CASH_REGISTERS, x = 0.4683f, y = 0.8356f, photo = "desalle/desalle_cash_20.webp"), // №20
                LootPoint(LootType.CASH_REGISTERS, x = 0.4763f, y = 0.8485f, photo = "desalle/desalle_cash_21.webp"), // №21
                LootPoint(LootType.CASH_REGISTERS, x = 0.4234f, y = 0.8836f, photo = "desalle/desalle_cash_22.webp"), // №22
                LootPoint(LootType.CASH_REGISTERS, x = 0.5823f, y = 0.8483f, photo = "desalle/desalle_cash_23.webp"), // №23
                LootPoint(LootType.CASH_REGISTERS, x = 0.5898f, y = 0.8677f, photo = "desalle/desalle_cash_24.webp"), // №24
                LootPoint(LootType.CASH_REGISTERS, x = 0.6257f, y = 0.8393f, photo = "desalle/desalle_cash_25.webp"), // №25
                LootPoint(LootType.CASH_REGISTERS, x = 0.6328f, y = 0.8355f, photo = "desalle/desalle_cash_26.webp"), // №26
                LootPoint(LootType.CASH_REGISTERS, x = 0.6462f, y = 0.8240f, photo = "desalle/desalle_cash_27.webp"), // №27
                LootPoint(LootType.CASH_REGISTERS, x = 0.6454f, y = 0.8348f, photo = "desalle/desalle_cash_28.webp"), // №28
                LootPoint(LootType.CASH_REGISTERS, x = 0.6428f, y = 0.8473f, photo = "desalle/desalle_cash_29.webp"), // №29
                LootPoint(LootType.CASH_REGISTERS, x = 0.6540f, y = 0.8477f, photo = "desalle/desalle_cash_30.webp"), // №30
                LootPoint(LootType.CASH_REGISTERS, x = 0.6509f, y = 0.8449f, photo = "desalle/desalle_cash_31.webp"), // №31
                LootPoint(LootType.CASH_REGISTERS, x = 0.6608f, y = 0.8493f, photo = "desalle/desalle_cash_32.webp"), // №32
                LootPoint(LootType.CASH_REGISTERS, x = 0.6545f, y = 0.8696f, photo = "desalle/desalle_cash_33.webp"), // №33
                LootPoint(LootType.CASH_REGISTERS, x = 0.6455f, y = 0.9052f, photo = "desalle/desalle_cash_34.webp"), // №34
                LootPoint(LootType.CASH_REGISTERS, x = 0.6705f, y = 0.9102f, photo = "desalle/desalle_cash_35.webp"), // №35
                LootPoint(LootType.CASH_REGISTERS, x = 0.6180f, y = 0.8114f, photo = "desalle/desalle_cash_36.webp"), // №36
                LootPoint(LootType.CASH_REGISTERS, x = 0.6226f, y = 0.8142f, photo = "desalle/desalle_cash_37.webp"), // №37
                LootPoint(LootType.CASH_REGISTERS, x = 0.6294f, y = 0.8088f, photo = "desalle/desalle_cash_38.webp"), // №38
                LootPoint(LootType.CASH_REGISTERS, x = 0.6834f, y = 0.8264f, photo = "desalle/desalle_cash_39.webp"), // №39
                LootPoint(LootType.CASH_REGISTERS, x = 0.7670f, y = 0.8711f, photo = "desalle/desalle_cash_40.webp"), // №40
                LootPoint(LootType.CASH_REGISTERS, x = 0.7758f, y = 0.8650f, photo = "desalle/desalle_cash_41.webp"), // №41
                LootPoint(LootType.CASH_REGISTERS, x = 0.8269f, y = 0.8371f, photo = "desalle/desalle_cash_42.webp"), // №42
                LootPoint(LootType.CASH_REGISTERS, x = 0.8390f, y = 0.8124f, photo = "desalle/desalle_cash_43.webp"), // №43
                LootPoint(LootType.CASH_REGISTERS, x = 0.8572f, y = 0.8179f, photo = "desalle/desalle_cash_44.webp"), // №44
                LootPoint(LootType.CASH_REGISTERS, x = 0.8920f, y = 0.8315f, photo = "desalle/desalle_cash_45.webp"), // №45
                LootPoint(LootType.CASH_REGISTERS, x = 0.8770f, y = 0.8002f, photo = "desalle/desalle_cash_46.webp"), // №46
                LootPoint(LootType.CASH_REGISTERS, x = 0.8691f, y = 0.7851f, photo = "desalle/desalle_cash_47.webp"), // №47
                LootPoint(LootType.CASH_REGISTERS, x = 0.8707f, y = 0.7898f, photo = "desalle/desalle_cash_48.webp"), // №48
                LootPoint(LootType.CASH_REGISTERS, x = 0.8769f, y = 0.7896f, photo = "desalle/desalle_cash_49.webp"), // №49
                LootPoint(LootType.CASH_REGISTERS, x = 0.8736f, y = 0.7663f, photo = "desalle/desalle_cash_50.webp"), // №50
                LootPoint(LootType.CASH_REGISTERS, x = 0.8765f, y = 0.7510f, photo = "desalle/desalle_cash_51.webp"), // №51
                LootPoint(LootType.CASH_REGISTERS, x = 0.8868f, y = 0.7670f, photo = "desalle/desalle_cash_52.webp"), // №52
                LootPoint(LootType.CASH_REGISTERS, x = 0.8421f, y = 0.7817f, photo = "desalle/desalle_cash_53.webp"), // №53
                LootPoint(LootType.CASH_REGISTERS, x = 0.8020f, y = 0.7842f, photo = "desalle/desalle_cash_54.webp"), // №54
                LootPoint(LootType.CASH_REGISTERS, x = 0.8434f, y = 0.7555f, photo = "desalle/desalle_cash_55.webp"), // №55
                LootPoint(LootType.CASH_REGISTERS, x = 0.8507f, y = 0.7543f, photo = "desalle/desalle_cash_56.webp"), // №56
                LootPoint(LootType.CASH_REGISTERS, x = 0.8511f, y = 0.7360f, photo = "desalle/desalle_cash_57.webp"), // №57
                LootPoint(LootType.CASH_REGISTERS, x = 0.8409f, y = 0.6798f, photo = "desalle/desalle_cash_58.webp"), // №58
                LootPoint(LootType.CASH_REGISTERS, x = 0.8388f, y = 0.6018f, photo = "desalle/desalle_cash_59.webp"), // №59
                LootPoint(LootType.CASH_REGISTERS, x = 0.8222f, y = 0.5637f, photo = "desalle/desalle_cash_60.webp"), // №60
                LootPoint(LootType.CASH_REGISTERS, x = 0.8599f, y = 0.5697f, photo = "desalle/desalle_cash_61.webp"), // №61
                LootPoint(LootType.CASH_REGISTERS, x = 0.8621f, y = 0.5728f, photo = "desalle/desalle_cash_62.webp"), // №62
                LootPoint(LootType.CASH_REGISTERS, x = 0.8599f, y = 0.5753f, photo = "desalle/desalle_cash_63.webp"), // №63
                LootPoint(LootType.CASH_REGISTERS, x = 0.8752f, y = 0.6099f, photo = "desalle/desalle_cash_64.webp"), // №64
                LootPoint(LootType.CASH_REGISTERS, x = 0.9276f, y = 0.5997f, photo = "desalle/desalle_cash_65.webp"), // №65
                LootPoint(LootType.CASH_REGISTERS, x = 0.9598f, y = 0.5577f, photo = "desalle/desalle_cash_66.webp"), // №66
                LootPoint(LootType.CASH_REGISTERS, x = 0.9374f, y = 0.5389f, photo = "desalle/desalle_cash_67.webp"), // №67
                LootPoint(LootType.CASH_REGISTERS, x = 0.8589f, y = 0.5344f, photo = "desalle/desalle_cash_68.webp"), // №68
                LootPoint(LootType.CASH_REGISTERS, x = 0.8352f, y = 0.5274f, photo = "desalle/desalle_cash_69.webp"), // №69
                LootPoint(LootType.CASH_REGISTERS, x = 0.9364f, y = 0.4841f, photo = "desalle/desalle_cash_70.webp"), // №70
                LootPoint(LootType.CASH_REGISTERS, x = 0.9576f, y = 0.4048f, photo = "desalle/desalle_cash_71.webp"), // №71
                LootPoint(LootType.CASH_REGISTERS, x = 0.7948f, y = 0.3135f, photo = "desalle/desalle_cash_72.webp"), // №72
                LootPoint(LootType.CASH_REGISTERS, x = 0.7999f, y = 0.3138f, photo = "desalle/desalle_cash_73.webp"), // №73
                LootPoint(LootType.CASH_REGISTERS, x = 0.7257f, y = 0.3633f, photo = "desalle/desalle_cash_74.webp"), // №74
                LootPoint(LootType.CASH_REGISTERS, x = 0.7182f, y = 0.3804f, photo = "desalle/desalle_cash_75.webp"), // №75
                LootPoint(LootType.CASH_REGISTERS, x = 0.7045f, y = 0.3423f, photo = "desalle/desalle_cash_76.webp"), // №76
                LootPoint(LootType.CASH_REGISTERS, x = 0.7082f, y = 0.4167f, photo = "desalle/desalle_cash_77.webp"), // №77
                LootPoint(LootType.CASH_REGISTERS, x = 0.7169f, y = 0.4245f, photo = "desalle/desalle_cash_78.webp"), // №78
                LootPoint(LootType.CASH_REGISTERS, x = 0.5913f, y = 0.3177f, photo = "desalle/desalle_cash_79.webp"), // №79
                LootPoint(LootType.CASH_REGISTERS, x = 0.5236f, y = 0.3842f, photo = "desalle/desalle_cash_80.webp"), // №80
                LootPoint(LootType.CASH_REGISTERS, x = 0.5178f, y = 0.3867f, photo = "desalle/desalle_cash_81.webp"), // №81
                LootPoint(LootType.CASH_REGISTERS, x = 0.5207f, y = 0.4921f, photo = "desalle/desalle_cash_82.webp"), // №82
                LootPoint(LootType.CASH_REGISTERS, x = 0.5426f, y = 0.5030f, photo = "desalle/desalle_cash_83.webp"), // №83
                LootPoint(LootType.CASH_REGISTERS, x = 0.5526f, y = 0.5219f, photo = "desalle/desalle_cash_84.webp"), // №84
                LootPoint(LootType.CASH_REGISTERS, x = 0.5643f, y = 0.5303f, photo = "desalle/desalle_cash_85.webp"), // №85
                LootPoint(LootType.CASH_REGISTERS, x = 0.5201f, y = 0.5328f, photo = "desalle/desalle_cash_86.webp"), // №86
                LootPoint(LootType.CASH_REGISTERS, x = 0.5049f, y = 0.5175f, photo = "desalle/desalle_cash_87.webp"), // №87
                LootPoint(LootType.CASH_REGISTERS, x = 0.6214f, y = 0.6011f, photo = "desalle/desalle_cash_88.webp"), // №88
                LootPoint(LootType.CASH_REGISTERS, x = 0.6337f, y = 0.6300f, photo = "desalle/desalle_cash_89.webp"), // №89
                LootPoint(LootType.CASH_REGISTERS, x = 0.6451f, y = 0.6443f, photo = "desalle/desalle_cash_90.webp"), // №90
                LootPoint(LootType.CASH_REGISTERS, x = 0.6487f, y = 0.6490f, photo = "desalle/desalle_cash_91.webp"), // №91
                LootPoint(LootType.CASH_REGISTERS, x = 0.6689f, y = 0.6326f, photo = "desalle/desalle_cash_92.webp"), // №92
                LootPoint(LootType.CASH_REGISTERS, x = 0.6323f, y = 0.6711f, photo = "desalle/desalle_cash_93.webp"), // №93
                LootPoint(LootType.CASH_REGISTERS, x = 0.6904f, y = 0.6833f, photo = "desalle/desalle_cash_94.webp"), // №94
                LootPoint(LootType.CASH_REGISTERS, x = 0.6795f, y = 0.6629f, photo = "desalle/desalle_cash_95.webp"), // №95
                LootPoint(LootType.CASH_REGISTERS, x = 0.7444f, y = 0.6280f, photo = "desalle/desalle_cash_96.webp"), // №96
                LootPoint(LootType.CASH_REGISTERS, x = 0.3685f, y = 0.6888f, photo = "desalle/desalle_cash_97.webp"), // №97
                LootPoint(LootType.CASH_REGISTERS, x = 0.3798f, y = 0.6616f, photo = "desalle/desalle_cash_98.webp"), // №98
                LootPoint(LootType.CASH_REGISTERS, x = 0.3379f, y = 0.6662f, photo = "desalle/desalle_cash_99.webp"), // №99
                LootPoint(LootType.CASH_REGISTERS, x = 0.3347f, y = 0.6465f, photo = "desalle/desalle_cash_100.webp"), // №100
                LootPoint(LootType.CASH_REGISTERS, x = 0.3395f, y = 0.6291f, photo = "desalle/desalle_cash_101.webp"), // №101
                LootPoint(LootType.CASH_REGISTERS, x = 0.2985f, y = 0.6121f, photo = "desalle/desalle_cash_102.webp"), // №102
                LootPoint(LootType.CASH_REGISTERS, x = 0.3235f, y = 0.5973f, photo = "desalle/desalle_cash_103.webp"), // №103
                LootPoint(LootType.CASH_REGISTERS, x = 0.3227f, y = 0.5933f, photo = "desalle/desalle_cash_104.webp"), // №104
                LootPoint(LootType.CASH_REGISTERS, x = 0.3237f, y = 0.5917f, photo = "desalle/desalle_cash_105.webp"), // №105
                LootPoint(LootType.CASH_REGISTERS, x = 0.3419f, y = 0.5934f, photo = "desalle/desalle_cash_106.webp"), // №106
                LootPoint(LootType.CASH_REGISTERS, x = 0.3634f, y = 0.5511f, photo = "desalle/desalle_cash_107.webp"), // №107
                LootPoint(LootType.CASH_REGISTERS, x = 0.3689f, y = 0.5497f, photo = "desalle/desalle_cash_108.webp"), // №108
                LootPoint(LootType.CASH_REGISTERS, x = 0.1615f, y = 0.6246f, photo = "desalle/desalle_cash_109.webp"), // №109
                LootPoint(LootType.CASH_REGISTERS, x = 0.1101f, y = 0.6649f, photo = "desalle/desalle_cash_110.webp"), // №110
                LootPoint(LootType.CASH_REGISTERS, x = 0.1130f, y = 0.6804f, photo = "desalle/desalle_cash_111.webp"), // №111
                LootPoint(LootType.CASH_REGISTERS, x = 0.0933f, y = 0.6672f, photo = "desalle/desalle_cash_112.webp"), // №112
                LootPoint(LootType.CASH_REGISTERS, x = 0.0948f, y = 0.6748f, photo = "desalle/desalle_cash_113.webp"), // №113
                LootPoint(LootType.CASH_REGISTERS, x = 0.1044f, y = 0.5990f, photo = "desalle/desalle_cash_114.webp"), // №114
                LootPoint(LootType.CASH_REGISTERS, x = 0.1090f, y = 0.5984f, photo = "desalle/desalle_cash_115.webp"), // №115
                LootPoint(LootType.CASH_REGISTERS, x = 0.0299f, y = 0.5920f, photo = "desalle/desalle_cash_116.webp"), // №116
                LootPoint(LootType.CASH_REGISTERS, x = 0.0236f, y = 0.6607f, photo = "desalle/desalle_cash_117.webp"), // №117
                LootPoint(LootType.CASH_REGISTERS, x = 0.0911f, y = 0.5804f, photo = "desalle/desalle_cash_118.webp"), // №118
                LootPoint(LootType.CASH_REGISTERS, x = 0.0974f, y = 0.5318f, photo = "desalle/desalle_cash_119.webp"), // №119
                LootPoint(LootType.CASH_REGISTERS, x = 0.1556f, y = 0.5018f, photo = "desalle/desalle_cash_120.webp"), // №120
                LootPoint(LootType.CASH_REGISTERS, x = 0.2798f, y = 0.4509f, photo = "desalle/desalle_cash_121.webp"), // №121
                LootPoint(LootType.CASH_REGISTERS, x = 0.1546f, y = 0.4593f, photo = "desalle/desalle_cash_122.webp"), // №122
                LootPoint(LootType.CASH_REGISTERS, x = 0.1614f, y = 0.4654f, photo = "desalle/desalle_cash_123.webp"), // №123
                LootPoint(LootType.CASH_REGISTERS, x = 0.1679f, y = 0.4305f, photo = "desalle/desalle_cash_124.webp"), // №124
                LootPoint(LootType.CASH_REGISTERS, x = 0.1582f, y = 0.4221f, photo = "desalle/desalle_cash_125.webp"), // №125
                LootPoint(LootType.CASH_REGISTERS, x = 0.1531f, y = 0.4265f, photo = "desalle/desalle_cash_126.webp"), // №126
                LootPoint(LootType.CASH_REGISTERS, x = 0.1480f, y = 0.4298f, photo = "desalle/desalle_cash_127.webp"), // №127
                LootPoint(LootType.CASH_REGISTERS, x = 0.0551f, y = 0.4279f, photo = "desalle/desalle_cash_128.webp"), // №128
                LootPoint(LootType.CASH_REGISTERS, x = 0.0670f, y = 0.4354f, photo = "desalle/desalle_cash_129.webp"), // №129
                LootPoint(LootType.CASH_REGISTERS, x = 0.1535f, y = 0.2802f, photo = "desalle/desalle_cash_130.webp"), // №130
                LootPoint(LootType.CASH_REGISTERS, x = 0.1403f, y = 0.2410f, photo = "desalle/desalle_cash_131.webp"), // №131
                LootPoint(LootType.CASH_REGISTERS, x = 0.1244f, y = 0.2263f, photo = "desalle/desalle_cash_132.webp"), // №132
                LootPoint(LootType.CASH_REGISTERS, x = 0.1196f, y = 0.2128f, photo = "desalle/desalle_cash_133.webp"), // №133
                LootPoint(LootType.CASH_REGISTERS, x = 0.0980f, y = 0.2575f, photo = "desalle/desalle_cash_134.webp"), // №134
                LootPoint(LootType.CASH_REGISTERS, x = 0.0582f, y = 0.2554f, photo = "desalle/desalle_cash_135.webp"), // №135
                LootPoint(LootType.CASH_REGISTERS, x = 0.1828f, y = 0.1918f, photo = "desalle/desalle_cash_136.webp"), // №136
                LootPoint(LootType.CASH_REGISTERS, x = 0.2744f, y = 0.1723f, photo = "desalle/desalle_cash_137.webp"), // №137
                LootPoint(LootType.CASH_REGISTERS, x = 0.4699f, y = 0.3411f, photo = "desalle/desalle_cash_138.webp"), // №138
                LootPoint(LootType.CASH_REGISTERS, x = 0.4286f, y = 0.3181f, photo = "desalle/desalle_cash_139.webp"), // №139
                LootPoint(LootType.CASH_REGISTERS, x = 0.4377f, y = 0.3134f, photo = "desalle/desalle_cash_140.webp"), // №140
                LootPoint(LootType.CASH_REGISTERS, x = 0.4364f, y = 0.3088f, photo = "desalle/desalle_cash_141.webp"), // №141
                LootPoint(LootType.CASH_REGISTERS, x = 0.4190f, y = 0.3674f, photo = "desalle/desalle_cash_142.webp"), // №142
                LootPoint(LootType.CASH_REGISTERS, x = 0.3739f, y = 0.1591f, photo = "desalle/desalle_cash_143.webp"), // №143
                LootPoint(LootType.CASH_REGISTERS, x = 0.3424f, y = 0.1348f, photo = "desalle/desalle_cash_144.webp"), // №144
                LootPoint(LootType.CASH_REGISTERS, x = 0.3595f, y = 0.1233f, photo = "desalle/desalle_cash_145.webp"), // №145
                LootPoint(LootType.CASH_REGISTERS, x = 0.3504f, y = 0.1094f, photo = "desalle/desalle_cash_146.webp"), // №146
                LootPoint(LootType.CASH_REGISTERS, x = 0.3444f, y = 0.1018f, photo = "desalle/desalle_cash_147.webp"), // №147
                LootPoint(LootType.CASH_REGISTERS, x = 0.3738f, y = 0.0881f, photo = "desalle/desalle_cash_148.webp"), // №148
                LootPoint(LootType.CASH_REGISTERS, x = 0.3940f, y = 0.1032f, photo = "desalle/desalle_cash_149.webp"), // №149
                LootPoint(LootType.CASH_REGISTERS, x = 0.3864f, y = 0.1093f, photo = "desalle/desalle_cash_150.webp"), // №150
                LootPoint(LootType.CASH_REGISTERS, x = 0.3931f, y = 0.1319f, photo = "desalle/desalle_cash_151.webp"), // №151
                LootPoint(LootType.CASH_REGISTERS, x = 0.5955f, y = 0.2065f, photo = "desalle/desalle_cash_152.webp"), // №152
                LootPoint(LootType.CASH_REGISTERS, x = 0.6008f, y = 0.2175f, photo = "desalle/desalle_cash_153.webp"), // №153
                LootPoint(LootType.CASH_REGISTERS, x = 0.5806f, y = 0.1535f, photo = "desalle/desalle_cash_154.webp"), // №154
                LootPoint(LootType.CASH_REGISTERS, x = 0.6043f, y = 0.1596f, photo = "desalle/desalle_cash_155.webp"), // №155
                LootPoint(LootType.CASH_REGISTERS, x = 0.6074f, y = 0.1654f, photo = "desalle/desalle_cash_156.webp"), // №156
                LootPoint(LootType.CASH_REGISTERS, x = 0.6335f, y = 0.1658f, photo = "desalle/desalle_cash_157.webp"), // №157
                LootPoint(LootType.CASH_REGISTERS, x = 0.6245f, y = 0.1665f, photo = "desalle/desalle_cash_158.webp"), // №158
                LootPoint(LootType.CASH_REGISTERS, x = 0.6215f, y = 0.1194f, photo = "desalle/desalle_cash_159.webp"), // №159
                LootPoint(LootType.CASH_REGISTERS, x = 0.5654f, y = 0.0896f, photo = "desalle/desalle_cash_160.webp"), // №160
                LootPoint(LootType.CASH_REGISTERS, x = 0.5774f, y = 0.0917f, photo = "desalle/desalle_cash_161.webp"), // №161
                LootPoint(LootType.CASH_REGISTERS, x = 0.6843f, y = 0.0985f, photo = "desalle/desalle_cash_162.webp"), // №162
                LootPoint(LootType.CASH_REGISTERS, x = 0.6826f, y = 0.0960f, photo = "desalle/desalle_cash_163.webp"), // №163
                LootPoint(LootType.CASH_REGISTERS, x = 0.7425f, y = 0.0924f, photo = "desalle/desalle_cash_164.webp"), // №164
                LootPoint(LootType.CASH_REGISTERS, x = 0.7450f, y = 0.1250f, photo = "desalle/desalle_cash_165.webp"), // №165
                LootPoint(LootType.CASH_REGISTERS, x = 0.7455f, y = 0.1329f, photo = "desalle/desalle_cash_166.webp"), // №166
                LootPoint(LootType.CASH_REGISTERS, x = 0.7586f, y = 0.1017f, photo = "desalle/desalle_cash_167.webp"), // №167
                LootPoint(LootType.CASH_REGISTERS, x = 0.7606f, y = 0.1438f, photo = "desalle/desalle_cash_168.webp"), // №168
                LootPoint(LootType.CASH_REGISTERS, x = 0.8000f, y = 0.1392f, photo = "desalle/desalle_cash_169.webp"), // №169
                LootPoint(LootType.CASH_REGISTERS, x = 0.8181f, y = 0.1456f, photo = "desalle/desalle_cash_170.webp"), // №170
                LootPoint(LootType.CASH_REGISTERS, x = 0.8162f, y = 0.1625f, photo = "desalle/desalle_cash_171.webp"), // №171

                // — Точки снабжения
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3905f, y = 0.2631f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3516f, y = 0.3013f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3004f, y = 0.3746f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.2183f, y = 0.4066f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.1668f, y = 0.3202f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3578f, y = 0.4661f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4158f, y = 0.4332f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4647f, y = 0.5015f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4174f, y = 0.5284f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3389f, y = 0.5511f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.1812f, y = 0.6936f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.1845f, y = 0.6921f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3156f, y = 0.7806f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.3484f, y = 0.7259f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5129f, y = 0.7902f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4995f, y = 0.6205f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4999f, y = 0.6250f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5920f, y = 0.5761f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5921f, y = 0.5786f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6484f, y = 0.5222f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7844f, y = 0.6280f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7722f, y = 0.5669f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.8098f, y = 0.4150f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6310f, y = 0.4031f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6504f, y = 0.3755f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6999f, y = 0.2870f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7019f, y = 0.2855f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6311f, y = 0.2855f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.6023f, y = 0.2627f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.7021f, y = 0.1602f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4887f, y = 0.1903f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4334f, y = 0.1556f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.4219f, y = 0.2148f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5286f, y = 0.2945f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5614f, y = 0.3182f),
                LootPoint(LootType.SUPPLY_POINTS, x = 0.5625f, y = 0.3194f),

                // — Упавший шар
                LootPoint(LootType.FALLEN_BALL, x = 0.1215f, y = 0.3686f),
                LootPoint(LootType.FALLEN_BALL, x = 0.2331f, y = 0.6312f),
                LootPoint(LootType.FALLEN_BALL, x = 0.4727f, y = 0.7210f),
                LootPoint(LootType.FALLEN_BALL, x = 0.7077f, y = 0.7340f),
                LootPoint(LootType.FALLEN_BALL, x = 0.8478f, y = 0.5067f),
                LootPoint(LootType.FALLEN_BALL, x = 0.6599f, y = 0.3412f)
            )
        )
    )

    /** Находит карту по её id. Если id неизвестен — возвращает первую. */
    fun byId(id: String?): GameMap = maps.firstOrNull { it.id == id } ?: maps.first()
}
