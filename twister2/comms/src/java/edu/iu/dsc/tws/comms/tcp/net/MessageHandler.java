//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package edu.iu.dsc.tws.comms.tcp.net;

import java.nio.channels.SocketChannel;

public interface MessageHandler {
  void onError(SocketChannel channel);

  void onConnect(SocketChannel channel, StatusCode status);

  void onClose(SocketChannel channel);

  void onReceiveComplete(SocketChannel channel, TCPRequest readRequest);

  void onSendComplete(SocketChannel channel, TCPRequest writeRequest);
}
