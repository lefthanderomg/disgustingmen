package murzin.disgustingmen.com.utils.extensions


fun String.validateUrl(): String = if (this.startsWith("http")) this else "http$this"