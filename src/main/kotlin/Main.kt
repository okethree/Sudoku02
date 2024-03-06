// 問題 question[i] : i行目の数字文字列
// 10級 Q1
//val question = listOf(
//    "070000020",
//    "600203091",
//    "000146000",
//    "017080430",
//    "003904500",
//    "089050160",
//    "000769000",
//    "920508006",
//    "030000050"
//)
// 9級 Q3
//val question = listOf(
//    "050000010",
//    "940000008",
//    "006514300",
//    "002049500",
//    "008102400",
//    "005830900",
//    "004983100",
//    "800000092",
//    "060000040"
//)
// 8級 Q7
//val question = listOf(
//    "320000090",
//    "900004608",
//    "000607010",
//    "002000170",
//    "000030000",
//    "084000200",
//    "070405000",
//    "801200006",
//    "090000047"
//)
// 7級 Q11
//val question = listOf(
//    "000361000",
//    "008000030",
//    "046000200",
//    "600030004",
//    "200175003",
//    "900020007",
//    "007000680",
//    "010000400",
//    "000594000"
//)
// 6級 Q15
//val question = listOf(
//    "000000401",
//    "000052000",
//    "006301008",
//    "008006370",
//    "040010050",
//    "023900800",
//    "400208700",
//    "000430000",
//    "302000000"
//)
// 5級 Q22
//val question = listOf(
//    "100020004",
//    "002905000",
//    "085000100",
//    "030009070",
//    "500070001",
//    "060500030",
//    "004000620",
//    "000304500",
//    "300060009"
//)
// 4級 Q27
//val question = listOf(
//    "008000002",
//    "050060030",
//    "700203000",
//    "003050100",
//    "040601080",
//    "007020400",
//    "000407003",
//    "010090060",
//    "500000200"
//)
// 3級 Q33
//val question = listOf(
//    "200508000",
//    "001000300",
//    "040090020",
//    "600301005",
//    "002000700",
//    "700206008",
//    "050010030",
//    "004000800",
//    "000603007"
//)
// 2級 Q41
//val question = listOf(
//    "006030001",
//    "000108000",
//    "405000200",
//    "030500070",
//    "600070005",
//    "020006090",
//    "001000302",
//    "000402000",
//    "700080400"
//)
// 1級 Q49
//val question = listOf(
//    "201000005",
//    "000030000",
//    "400805000",
//    "002901400",
//    "010000020",
//    "005708900",
//    "000604007",
//    "000010000",
//    "900000203"
//)
// 初段 Q57
//val question = listOf(
//    "000400001",
//    "040503080",
//    "007000600",
//    "620070040",
//    "000102000",
//    "010030059",
//    "003000400",
//    "050208070",
//    "900005000"
//)
// 読売新聞2024/02/25 本問
//val question = listOf(
//    "037000020",
//    "200908003",
//    "100000600",
//    "050070010",
//    "000604000",
//    "020030040",
//    "006000008",
//    "900301004",
//    "040000760"
//)
// 読売新聞2024/02/25 例題
//val question = listOf(
//    "001007500",
//    "003400008",
//    "200010030",
//    "050002900",
//    "900050002",
//    "006300070",
//    "030080004",
//    "400009700",
//    "007200100"
//)
// 二段 Q65
//val question = listOf(
//    "400080002",
//    "002000800",
//    "030401090",
//    "001002400",
//    "500000006",
//    "004500200",
//    "010309070",
//    "005000900",
//    "300060004"
//)
// 五段 Q93
//val question = listOf(
//    "700000000",
//    "000406050",
//    "003010400",
//    "060802040",
//    "008090300",
//    "040607010",
//    "001020700",
//    "020901000",
//    "000000009"
//)
// 八段 Q129
//val question = listOf(
//    "000080006",
//    "069000720",
//    "020040030",
//    "000402000",
//    "103000204",
//    "000105000",
//    "090060080",
//    "081000590",
//    "200010000"
//)
// 十段 Q169
//val question = listOf(
//    "006004020",
//    "000006005",
//    "803007000",
//    "000509216",
//    "000000000",
//    "932108000",
//    "000900708",
//    "100700000",
//    "040600500"
//)
// 名人 Q195
val question = listOf(
    "000300004",
    "002080000",
    "080761000",
    "903000400",
    "047000950",
    "008000102",
    "000237010",
    "000050700",
    "600009000"
)
// 王者 Q233
//val question = listOf(
//    "090000043",
//    "740030056",
//    "005000000",
//    "000058000",
//    "020601080",
//    "000370000",
//    "000000700",
//    "580090034",
//    "160000020"
//)

// 解答 answer[y][x] : y行 x列 の数値(Int)
var answer: Array<IntArray> = Array(9){IntArray(9)}

// 縦方向の数値の使用の有無 vLine[num][x] : 数値num が x列目の縦の列に存在する場合は1、存在しない場合は0
var vLine = Array(10){IntArray(9)}

// 横方向の数値の使用の有無 hLine[num][y] : 数値num が y行目の横の行に存在する場合は1、存在しない場合は0
var hLine = Array(10){IntArray(9)}

// 各ブロックの数値の使用の有無 blockNum[yBlock][xBlock][num] : yBlock行、xBlock列のブロックに数値numが存在する場合は1、存在しない場合は0
var blockNum = Array(3){Array(3){IntArray(10)}}

// 縦方向の使用済の数字の個数 vCount[x] : x列の数字の使用済の個数
var vCount = IntArray(9)

// 横方向の使用済の数字の個数 hCount[y] : y行の数字の使用済の個数
var hCount = IntArray(9)

// 各ブロックの使用済の数字の個数 blockCount[y][x] : yBlock行、xBlock列のブロックの数字の使用済の個数
var blockCount = Array(3){IntArray(3)}

// 横方向の数値の使用の有無 hBlockLine[num][xBlock][y] : 数値num が hBlock列のy行目の横の行に存在する場合は1、存在しない場合は0
var hBlockLine = Array(10){Array(3){IntArray(9)}}


fun main() {
    copyQtoA()
    showAnswer()
    vCheck()
    //vShow()
    hCheck()
    //hShow()
    blockCheck()
    //showBlockNum()
    var continueFlg = true

    while (continueFlg) {
        continueFlg = false
        if (searchBlock()) continueFlg = true
        if (checkCount8()) continueFlg = true
        if (checkBlockOnlyOne()) continueFlg = true
        if (checkVLineOnlyOne()) continueFlg = true
        if (checkHLineOnlyOne()) continueFlg = true
    }

    showAnswer()
}

fun copyQtoA() {
    for (i in 0..8) {
        for (j in 0..8) {
            answer[i][j] = question[i][j].toString().toInt()
        }
    }
}

fun showAnswer() {
    println("answer is...")

    println("+-----+-----+-----+")
    for (i in 0..8) {
        print("|")
        for (j in 0..8) {
            print("${if (answer[i][j] == 0) " " else answer[i][j]}${if(j % 3 == 2) "|" else " "}")
        }
        println()
        if (i % 3 == 2) {
            println("+-----+-----+-----+")
        }
    }
}

fun vCheck() {
    for (num in 1..9) {
        for (v in 0..8) {
            if (vLine[num][v] == 1) continue
            for (i in 0..8) {
                if (answer[i][v] == num) {
                    vLine[num][v] = 1
                    vCount[v]++
                    break
                }
            }
        }
    }
}

fun vShow() {
    for (num in 1..9) {
        print("$num: ")
        for (i in 0..8) {
            print("${vLine[num][i]} ")
        }
        println()
    }
}


fun hCheck() {
    for (num in 1..9) {
        for (h in 0..8) {
            if (hLine[num][h] == 1) continue
            for (i in 0..8) {
                if (answer[h][i] == num) {
                    hLine[num][h] = 1
                    hCount[h]++
                    break
                }
            }
        }
    }
}

fun hShow() {
    for (num in 1..9) {
        print("$num: ")
        for (i in 0..8) {
            print("${hLine[num][i]} ")
        }
        println()
    }
}

fun blockCheck() {
    for (y in 0..2) {
        var v = y * 3
        for (x in 0..2) {
            var h = x * 3
            for (i in 0..8) {
                var num = answer[v + (i / 3)][h + (i % 3)]
                if (num != 0) {
                    blockNum[y][x][num] = 1
                    blockCount[y][x]++
                }
            }
        }
    }
}

fun showBlockNum() {
    for (y in 0..2) {
        for (x in 0..2) {
            print("[$y][$x]: ")
            for (i in 1..9) {
                print("${blockNum[y][x][i]} ")
            }
            println()
        }
    }
}

fun hBlockCheck() {
    for (num in 1..9) {
        for (blkY in 0..2) {
            for (blkX in 0..2) {
                if (blockNum[blkY][blkX][num] == 1) continue

                // 他の横ブロックに２行同じnumがある場合のチェック
                var lineCount = 0
                var startY = blkY * 3
                var targetY = -1
                for (i in 0..2) {
                    if (hLine[num][startY + i] == 1) {
                        lineCount++
                    } else {
                        targetY = startY + i
                    }
                }
                if (lineCount == 2) {
                    // 他の２ブロックの２行に同じnumがあった場合
                    hBlockLine[num][blkX][targetY] = 1
                    continue
                }

                // 同一ブロック内の横方向の数字が埋まっている場合のチェック


            }
        }
    }
}

fun searchBlock(): Boolean {
    var changeFlg = false
    var searchFlg = true

    while (searchFlg) {
        searchFlg = false
        for (num in 1..9) {
            for (y in 0..2) {
                for (x in 0..2) {
                    // 数値 num の y行 x列 のブロックの候補チェック
                    // このブロックに数値numが存在する場合は次に進む
                    if (blockNum[y][x][num] == 1) continue

                    // 縦方向の２列にこの数値numが使用済みの場合は未使用の列を検討する
                    if (vLine[num][x * 3] + vLine[num][x * 3 + 1] + vLine[num][x * 3 + 2] == 2) {
                        // 縦方向の２列にこの数値numが使用済みの場合
                        // 未使用の列番号の検索 => x0
                        var x0 = 0
                        for (i in 0..2) {
                            if (vLine[num][x * 3 + i] == 0) {
                                x0 = x * 3 + i
                                break
                            }
                        }
                        // この列の縦方向の空きの欄の個数をチェック
                        var count = 0
                        var y0 = 0
                        for (i in 0..2) {
                            if (answer[y * 3 + i][x0] == 0 && hLine[num][y * 3 + i] == 0) {
                                count++
                                y0 = y * 3 + i
                            }
                        }
                        // 個数が１個なら、ここに数値numが入る
                        if (count == 1) {
                            setNum(y0, x0, num)
                            searchFlg = true
                            changeFlg = true
                            break
                        }
                    }

                    // 横方向の２行にこの数値numが使用済みの場合は未使用の行を検討する
                    if (hLine[num][y * 3] + hLine[num][y * 3 + 1] + hLine[num][y * 3 + 2] == 2) {
                        // 横方向の２行にこの数値numが使用済みの場合
                        // 未使用の行番号の検索 => y0
                        var y0 = 0
                        for (i in 0..2) {
                            if (hLine[num][y * 3 + i] == 0) {
                                y0 = y * 3 + i
                                break
                            }
                        }
                        // この列の横方向の空きの欄の個数をチェック
                        var count = 0
                        var x0 = 0
                        for (i in 0..2) {
                            if (answer[y0][x * 3 + i] == 0 && vLine[num][x * 3 + i] == 0) {
                                count++
                                x0 = x * 3 + i
                            }
                        }
                        // 個数が１個なら、ここに数値numが入る
                        if (count == 1) {
                            setNum(y0, x0, num)
                            searchFlg = true
                            changeFlg = true
                            break
                        }
                    }
                    if (blockNum[y][x][num] == 1) continue

                }
            }
        }
    }

    return changeFlg
}

fun checkCount8(): Boolean {
    var changeFlg = false
    var searchFlg = true

    while (searchFlg) {
        searchFlg = false
        // 縦方向のカウント８チェック
        for (x in 0..8) {
            if (vCount[x] == 8) {
                var y0 = 0
                for (i in 0..8) {
                    if (answer[i][x] == 0) {
                        y0 = i
                        break
                    }
                }
                var num = 0
                for (i in 1..9) {
                    if (vLine[i][x] == 0) {
                        num = i
                        break
                    }
                }
                setNum(y0, x, num)
                searchFlg = true
                changeFlg = true
            }
        }

        // 横方向のカウント８チェック
        for (y in 0..8) {
            if (hCount[y] == 8) {
                var x0 = 0
                for (i in 0..8) {
                    if (answer[y][i] == 0) {
                        x0 = i
                        break
                    }
                }
                var num = 0
                for (i in 1..9) {
                    if (hLine[i][y] == 0) {
                        num = i
                        break
                    }
                }
                setNum(y, x0, num)
                searchFlg = true
                changeFlg = true
            }
        }

        // ブロックのカウント８チェック
        for (y in 0..2) {
            for (x in 0..2) {
                if (blockCount[y][x] == 8) {
                    var x0 = -1
                    var y0 = -1
                    for (i in 0..2) {
                        for (j in 0..2) {
                            if (answer[y * 3 + i][x * 3 + j] == 0) {
                                x0 = x * 3 + j
                                y0 = y * 3 + i
                                break
                            }
                        }
                        if (x0 >= 0) break
                    }
                    var num = 0
                    for (i in 1..9) {
                        if (blockNum[y][x][i] == 0) {
                            num = i
                            break
                        }
                    }
                    setNum(y0, x0, num)
                    searchFlg = true
                    changeFlg = true
                }
            }
        }

    }

    return changeFlg
}

fun setNum(y: Int, x: Int, num: Int) {
    answer[y][x] = num
    vLine[num][x] = 1
    hLine[num][y] = 1
    blockNum[y / 3][x / 3][num] = 1
    vCount[x]++
    hCount[y]++
    blockCount[y / 3][x / 3]++
}

fun checkBlockOnlyOne(): Boolean {
    var changeFlg = false
    var searchFlg = true

    while (searchFlg) {
        searchFlg = false

        for (y in 0..2) {
            for (x in 0..2) {
                for (num in 1..9) {
                    if (blockNum[y][x][num] == 1) continue

                    var x0 = -1
                    var y0 = -1
                    var count = 0

                    for (i in 0..2) {
                        if (hLine[num][y * 3 + i] == 1) continue

                        for (j in 0..2) {
                            if (answer[y * 3 + i][x * 3 + j] != 0) continue
                            if (vLine[num][x * 3 + j] == 1) continue
                            // 候補欄を見つけた
                            x0 = x * 3 + j
                            y0 = y * 3 + i
                            count++
                        }
                    }

                    if (count == 1) {
                        setNum(y0, x0, num)
                        searchFlg = true
                        changeFlg = true
                    }
                }
            }
        }
    }

    return changeFlg
}


fun checkVLineOnlyOne(): Boolean {
    var changeFlg = false
    var searchFlg = true

    while (searchFlg) {
        searchFlg = false

        for (x in 0..8) {
            // 縦１列の数字が埋まっている場合は次の列に進む
            if (vCount[x] == 9) continue

            for (num in 1..9) {
                // 数値numが存在している場合は次の数値に進む
                if (vLine[num][x] == 1) continue

                var y0 = -1
                var count = 0

                for (i in 0..8) {
                    // この欄が空白かどうかのチェック（数字が入っていたら、次の行に進む）
                    if (answer[i][x] != 0) continue
                    // この行に同じ数字が入っているかどうかのチェック（数字が入っていたら、次の行に進む）
                    if (hLine[num][i] == 1) continue
                    // このブロックに同じ数字が入っているかどうかのチェック（数字が入っていたら、次の行に進む）
                    if (blockNum[i / 3][x / 3][num] == 1) continue
                    // 候補欄を見つけた(空欄で横方向に同じ数字がなく、このブロックにも同じ数字がない場合)
                    y0 = i
                    count++
                }

                // この列で指定された数字が一つの欄しか入らない場合
                if (count == 1) {
                    setNum(y0, x, num)
                    searchFlg = true
                    changeFlg = true
                }
            }
        }
    }

    return changeFlg
}

fun checkHLineOnlyOne(): Boolean {
    var changeFlg = false
    var searchFlg = true

    while (searchFlg) {
        searchFlg = false

        for (y in 0..8) {
            // 横１行の数字が埋まっている場合は次の列に進む
            if (hCount[y] == 9) continue

            for (num in 1..9) {
                // 数値numが存在している場合は次の数値に進む
                if (hLine[num][y] == 1) continue

                var x0 = -1
                var count = 0

                for (i in 0..8) {
                    if (answer[y][i] != 0) continue
                    if (vLine[num][i] == 1) continue
                    if (blockNum[y / 3][i / 3][num] == 1) continue
                    // 候補欄を見つけた(空欄で縦方向に同じ数字がなく、このブロックにも同じ数字がない場合)
                    x0 = i
                    count++
                }

                if (count == 1) {
                    setNum(y, x0, num)
                    searchFlg = true
                    changeFlg = true
                }
            }
        }
    }

    return changeFlg
}

