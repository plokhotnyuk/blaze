package org.http4s.blaze.http.http20

class FlowWindow(var maxWindow: Int) {
  var window = maxWindow
  def apply(): Int = window
}
