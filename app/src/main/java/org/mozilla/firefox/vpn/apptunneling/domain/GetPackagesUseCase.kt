package org.mozilla.firefox.vpn.apptunneling.domain

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.mozilla.firefox.vpn.apptunneling.data.AppTunnelingRepository

class GetPackagesUseCase(
    private val appTunnelingRepository: AppTunnelingRepository
) {

    suspend operator fun invoke() = withContext(Dispatchers.IO) {
        appTunnelingRepository.getPackages(appTunnelingRepository.isShowingSystemApps())
    }
}
