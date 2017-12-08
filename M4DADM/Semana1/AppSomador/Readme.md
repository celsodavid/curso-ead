# Como configurar a IDE Android Studio 2.1.2

1. Passo 1
	1. Instalar JDK 8
2. Caso ja possua mais de ums JDK instalado
	1. Em File > Settings > Build, Execution, Deployment > Gradle
		1. Set "Use local gradle wrapper task configuration"
		2. Em Gradle home add caminho do gradle em sua maquina local, se não tiver baixar em [Gradle Download](https://gradle.org/install/#install)
		3. Clique em OK
		4. [Solução do Bug do Gradle](https://stackoverflow.com/questions/45899027/errorbug-exception-in-phase-class-generation-in-source-unit-buildscript)
	2. Caso precise trocar a versão do SDK
		1. File > project Structure into Project Structure > SDK Location
		2. Em JDK Location add o caminho do jdk
		3. Clique em OK
		4. [Solucão do Bug do JDK](https://stackoverflow.com/questions/16581752/android-studio-how-to-change-android-sdk-path)do 
3. Abrir o arquivo build.gradle
	1. trocar por com.android.support:appcompat-v7:23.4.0
	2. trocar por compileSdkVersion 23
	3. trocar por buildToolsVersion 24.0.1
	4. trocar por targetSdkVersion
	5. salvar arquivo
	6. Pode ser que pessa para fazer um download de uma lib
	7. [Solução do Bug appcompat-v7](https://stackoverflow.com/questions/42313573/failed-to-resolve-com-android-supportappcompat-v725-1-0)
4. Correção do redenrização
	1. ![Solução](https://github.com/celsodavid/curso-ead/blob/master/M4DADM/Semana1/AppSomador/solucao.png) 

	
