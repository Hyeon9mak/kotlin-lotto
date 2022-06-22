package lotto.domain

import lotto.domain.lottoticket.LottoNumber
import lotto.domain.lottoticket.LottoNumbers
import lotto.domain.lottoticket.LottoTicket

class WinningTicket private constructor(
    private val lottoNumbers: LottoNumbers,
    private val bonusNumber: LottoNumber,
) {
    init {
        require(lottoNumbers.notContains(bonusNumber)) {
            "보너스 번호는 당첨 번호들과 중복될 수 없습니다."
        }
    }

    fun matchResult(lottoTicket: LottoTicket): WinningAmount = WinningAmount.findByMatchCount(
        matchCount = lottoNumbers.matchedNumberCount(other = lottoTicket.lottoNumbers),
        matchBonus = bonusNumber in lottoTicket.lottoNumbers
    )

    companion object {
        fun of(lottoNumbers: List<Int>, bonusNumber: Int): WinningTicket = WinningTicket(
            lottoNumbers = LottoNumbers.createWithSort(convertToLottoNumberSet(lottoNumbers)),
            bonusNumber = LottoNumber.from(bonusNumber)
        )

        private fun convertToLottoNumberSet(numbers: List<Int>) =
            numbers.map { LottoNumber.from(it) }
                .toSet()
    }
}
