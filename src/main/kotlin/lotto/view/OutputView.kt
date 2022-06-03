package lotto.view

import lotto.domain.LottoTicket
import lotto.domain.WinningAmount
import lotto.domain.WinningAmount.FIRST
import lotto.domain.WinningAmount.FOURTH
import lotto.domain.WinningAmount.SECOND
import lotto.domain.WinningAmount.THIRD
import java.math.BigDecimal

class OutputView {

    fun printLottos(lottoTickets: List<LottoTicket>) {
        println("${lottoTickets.size}개를 구매했습니다.")
        lottoTickets.forEach { printLotto(it) }
        println()
    }

    private fun printLotto(lottoTicket: LottoTicket) {
        println(
            lottoTicket.lottoNumbers
                .values
                .map { it.value }
        )
    }

    fun printWinningResult(results: Map<WinningAmount, Int>) {
        println("당첨 통계")
        println("---------")
        println("${FOURTH.matchCount}개 일치 (${FOURTH.amount}원)- ${results[FOURTH]}개")
        println("${THIRD.matchCount}개 일치 (${THIRD.amount}원)- ${results[THIRD]}개")
        println("${SECOND.matchCount}개 일치 (${SECOND.amount}원)- ${results[SECOND]}개")
        println("${FIRST.matchCount}개 일치 (${FIRST.amount}원)- ${results[FIRST]}개")
    }

    fun printYield(yield: BigDecimal) {
        println("총 수익률은 ${`yield`}입니다.")
    }
}
