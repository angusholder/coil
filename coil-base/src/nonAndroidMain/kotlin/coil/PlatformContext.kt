package coil

import kotlin.jvm.JvmField

actual abstract class PlatformContext private constructor() {
    companion object {
        @JvmField val INSTANCE = object : PlatformContext() {}
    }
}
