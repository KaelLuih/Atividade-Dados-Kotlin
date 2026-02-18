# 🎲 Jogo de Dados - Kotlin

> Uma aplicação Android moderna e elegante para jogabilidade de dados com interface intuitiva construída com Jetpack Compose.

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.22-7F52FF?style=flat&logo=kotlin)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Android-14%2B-3DDC84?style=flat&logo=android)](https://developer.android.com/)
[![Gradle](https://img.shields.io/badge/Gradle-Build-02303A?style=flat&logo=gradle)](https://gradle.org/)
[![License](https://img.shields.io/badge/License-MIT-green?style=flat)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat)](https://github.com/KaelLuih/Atividade-Dados-Kotlin)

---

## 📋 Índice

- [Visão Geral](#-visão-geral)
- [Características](#-características)
- [Requisitos do Sistema](#-requisitos-do-sistema)
- [Instalação](#-instalação)
- [Como Usar](#-como-usar)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Arquitetura](#-arquitetura)
- [Contribuição](#-contribuição)
- [Licença](#-licença)

---

## 🎯 Visão Geral

O **Jogo de Dados Kotlin** é uma aplicação de entretenimento que simula a jogabilidade clássica de dados com uma interface moderna e responsiva. Desenvolvido utilizando as mais recentes tecnologias do Android, este projeto demonstra boas práticas de desenvolvimento, arquitetura limpa e design elegante.

Perfeito para aprender desenvolvimento Android com Kotlin, Jetpack Compose e Material Design 3.

---

## ✨ Características

### 🎮 Funcionalidades Principais
- **Simulação Realista de Dados**: Geração de números aleatórios com distribuição uniforme
- **Jogabilidade Intuitiva**: Interface amigável com controles responsivos
- **Sistema de Pontuação**: Rastreamento automático de pontos e histórico de rodadas
- **Modo Multijogador**: Suporte para múltiplos jogadores em uma única sessão
- **Temas Personalizáveis**: Suporte a dark/light mode com Material Design 3
- **Estatísticas em Tempo Real**: Visualização instantânea de resultados e análises
- **Histórico de Partidas**: Registro completo de todas as jogadas anteriores

### 🏗️ Qualidade Técnica
- ✅ Arquitetura em camadas bem definida
- ✅ Código 100% em Kotlin
- ✅ Testes unitários integrados
- ✅ Build otimizado com Gradle
- ✅ ProGuard configurado para release builds
- ✅ Suporte a vector drawables

---

## 🔧 Requisitos do Sistema

### Mínimos
- **Android SDK**: 24 (Android 7.0 Nougat) ou superior
- **Target SDK**: 34 (Android 14)
- **Kotlin**: 1.9.22+
- **JDK**: 1.8+
- **RAM**: 2 GB mínimo
- **Espaço em Disco**: 50 MB

### Recomendados
- **Android SDK**: 34 (Android 14)
- **Dispositivo**: Android 12+
- **RAM**: 4 GB+
- **Processador**: ARM64 ou superior

---

## 📦 Instalação

### Pré-requisitos
Certifique-se de ter instalado:
- [Git](https://git-scm.com/)
- [Android Studio Giraffe](https://developer.android.com/studio) ou posterior
- [Java Development Kit (JDK) 11+](https://www.oracle.com/java/technologies/downloads/)

### Passo 1: Clonar o Repositório

```bash
git clone https://github.com/KaelLuih/Atividade-Dados-Kotlin.git
cd Atividade-Dados-Kotlin
```

### Passo 2: Abrir no Android Studio

```bash
# No Android Studio, selecione: File > Open > Atividade-Dados-Kotlin
```

### Passo 3: Sincronizar Gradle

O Android Studio sincronizará automaticamente o Gradle. Se não, execute:

```bash
./gradlew sync
```

### Passo 4: Compilar o Projeto

```bash
./gradlew build
```

### Passo 5: Executar a Aplicação

#### Opção A: Via Android Studio
1. Conecte um dispositivo Android ou inicie um emulador
2. Clique em **Run** (Shift + F10)
3. Selecione o dispositivo de destino

#### Opção B: Via Terminal

```bash
# Instalar a aplicação
./gradlew installDebug

# Executar a aplicação
adb shell am start -n com.example.jogododado/.MainActivity
```

---

## 🎮 Como Usar

### Iniciando uma Partida

1. **Abra a Aplicação**: Toque no ícone do Jogo de Dados na tela inicial
2. **Selecione o Modo**:
   - 👤 **Modo Individual**: Jogue sozinho e bata seus próprios recordes
   - 👥 **Modo Competitivo**: Desafie outro jogador na mesma sessão

### Durante a Partida

| Ação | Como Fazer |
|------|-----------|
| **Rolar os Dados** | Toque no grande botão "ROLAR" no centro |
| **Ver Resultado** | Os números dos dados aparecem instantaneamente |
| **Pontuação** | Seu total é atualizado automaticamente |
| **Próxima Rodada** | Toque em "Próxima Rodada" para continuar |
| **Ver Histórico** | Deslize para a esquerda para ver o histórico completo |

### Finalizando a Partida

- Toque em **"Finalizar Partida"** quando desejar encerrar
- Seus resultados serão salvos automaticamente no histórico
- Toque em **"Nova Partida"** para começar novamente

---

## 📁 Estrutura do Projeto

```
Atividade-Dados-Kotlin/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/com/example/jogododado/
│   │   │   │   ├── MainActivity.kt          # Atividade principal
│   │   │   │   ├── ui/
│   │   │   │   │   ├── theme/               # Configuração de tema
│   │   │   │   │   ├── screens/             # Telas compostas
│   │   │   │   │   └── components/          # Componentes reutilizáveis
│   │   │   │   ├── data/
│   │   │   │   │   ├── models/              # Modelos de dados
│   │   │   │   │   ├── repository/          # Repositórios
│   │   │   │   │   └── local/               # Acesso a dados locais
│   │   │   │   └── viewmodel/               # ViewModels (lógica)
│   │   │   ├── res/
│   │   │   │   ├── values/                  # Recursos (strings, cores)
│   │   │   │   └── drawable/                # Drawables e ícones
│   │   │   └── AndroidManifest.xml
│   │   ├── test/                            # Testes unitários
│   │   └── androidTest/                     # Testes instrumentados
│   ├── build.gradle.kts                     # Configuração do módulo
│   └── proguard-rules.pro                   # Regras ProGuard
├── gradle/                                  # Scripts Gradle
├── build.gradle.kts                         # Configuração raiz
├── settings.gradle.kts                      # Configuração de módulos
├── gradle.properties                        # Propriedades Gradle
├── gradlew                                  # Gradle wrapper (Unix)
├── gradlew.bat                              # Gradle wrapper (Windows)
└── README.md                                # Este arquivo
```

---

## 🛠️ Tecnologias Utilizadas

### Linguagem
- **Kotlin** 1.9.22 - Linguagem de programação moderna e segura

### Framework Android
- **AndroidX Core** - APIs principais do Android
- **Jetpack Compose** - UI declarativa moderna
- **Material Design 3** - Sistema de design do Google

### Ferramentas de Build
- **Gradle** (Kotlin DSL) - Sistema de build robusto
- **ProGuard** - Otimização de código para release

### Testes
- **JUnit 4** - Framework de testes unitários
- **Espresso** - Testes de UI instrumentados

### Compatibilidade
- Android 7.0 Nougat (API 24) e superior
- Target Android 14 (API 34)

---

## 🏛️ Arquitetura

O projeto segue a arquitetura **MVVM** (Model-View-ViewModel) com separação clara de responsabilidades:

```
┌─────────────────────────────────────┐
│     UI Layer (Jetpack Compose)      │
│  - MainActivity                     │
│  - Screens (Telas)                  │
│  - Components (Componentes)         │
└────────────┬────────────────────────┘
             │
┌────────────▼────────────────────────┐
│     ViewModel Layer                 │
│  - Lógica de negócio               │
│  - Gerenciamento de estado         │
│  - Interação com repositório       │
└────────────┬────────────────────────┘
             │
┌────────────▼────────────────────────┐
│     Data Layer                      │
│  - Repositório                      │
│  - Modelos de dados                 │
│  - Acesso a dados locais            │
└─────────────────────────────────────┘
```

### Componentes Principais

| Componente | Responsabilidade |
|-----------|-----------------|
| **MainActivity** | Ponto de entrada, configuração de tema |
| **Screens** | Telas da aplicação (Jogo, Histórico, Configurações) |
| **Components** | Elementos reutilizáveis (Botões, Cards, Dados) |
| **ViewModel** | Gerenciamento de estado e lógica de jogo |
| **Repository** | Abstrair acesso a dados |
| **Models** | Entidades de dados (Partida, Jogador, Resultado) |

---

## 🔄 Fluxo de Dados

```
Usuário interage com UI
         ↓
Compose atualiza estado
         ↓
ViewModel processa lógica
         ↓
Repository consulta dados
         ↓
UI reflete mudanças
         ↓
Histórico salvo localmente
```

---

## 🚀 Compilação e Release

### Build de Debug

```bash
./gradlew assembleDebug
```

### Build de Release

```bash
./gradlew assembleRelease
```

O APK será gerado em: `app/build/outputs/apk/`

### Assinatura de Release

Para produção, configure assinatura:

```bash
./gradlew bundleRelease
```

---

## 📊 Configuração do Projeto

### Versões

```kotlin
// app/build.gradle.kts
android {
    compileSdk = 34
    defaultConfig {
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}
```

### Dependências Principais

```kotlin
dependencies {
    // Core Android
    implementation("androidx.core:core-ktx:1.x.x")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.x.x")
    
    // Compose
    implementation("androidx.activity:activity-compose:1.x.x")
    implementation("androidx.compose.material3:material3:1.x.x")
    
    // Testes
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.x.x")
}
```

---

## 🐛 Resolução de Problemas

### Problema: "Gradle sync failed"
**Solução**: 
```bash
./gradlew clean
./gradlew sync
```

### Problema: "Cannot find symbol - class MainActivity"
**Solução**: 
- Verifique se o Android SDK está instalado corretamente
- Sincronize o projeto novamente: Ctrl+Shift+P (Windows) ou Cmd+Shift+P (Mac)

### Problema: "Error: Unable to resolve dependency"
**Solução**: 
```bash
./gradlew build --refresh-dependencies
```

### Problema: Emulador não inicia
**Solução**: 
- Verifique virtualization no BIOS
- Use um dispositivo físico
- Reinicie o Android Studio

---

## 🤝 Contribuição

Contribuições são bem-vindas! Para contribuir:

### 1. Fork o Projeto
```bash
# Clique em "Fork" no GitHub
```

### 2. Crie uma Branch para sua Feature
```bash
git checkout -b feature/MinhaFeature
```

### 3. Commit suas Mudanças
```bash
git commit -m "Adiciona MinhaFeature"
```

### 4. Push para a Branch
```bash
git push origin feature/MinhaFeature
```

### 5. Abra um Pull Request

### Diretrizes de Contribuição
- Mantenha o código em Kotlin puro
- Siga as convenções de nomenclatura
- Adicione testes para novas features
- Documente mudanças significativas
- Use commits semânticos

---

## 📝 Padrões de Código

### Nomenclatura
- **Classes**: `PascalCase` (ex: `MainActivity`)
- **Variáveis**: `camelCase` (ex: `diceValue`)
- **Constantes**: `UPPER_SNAKE_CASE` (ex: `MAX_DICE_VALUE`)
- **Funções**: `camelCase` (ex: `rollDice()`)

### Formatação
```kotlin
// ✅ Bom
fun calculateScore(player: Player): Int {
    return player.rolls.sum()
}

// ❌ Ruim
fun calculateScore(p:Player):Int{return p.rolls.sum()}
```

---

## 📈 Roadmap Futuro

- [ ] Sistema de ranking online
- [ ] Modos de jogo adicionais
- [ ] Sincronização na nuvem
- [ ] Suporte a 4+ jogadores
- [ ] Customização de avatares
- [ ] Integrações com redes sociais
- [ ] Sistema de conquistas e badges
- [ ] Modo offline melhorado

---

## 📞 Suporte

Para dúvidas ou problemas:

1. **Issues**: Abra uma issue no GitHub
2. **Email**: Contate o desenvolvedor
3. **Documentação**: Consulte a wiki do projeto

---

## 📄 Licença

Este projeto é licenciado sob a **Licença MIT** - veja o arquivo LICENSE para detalhes.

```
MIT License

Copyright (c) 2026 Kael Luih de Araujo

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions...
```

---

## 👨‍💻 Autor

**Kael Luih de Araujo**
- GitHub: [@KaelLuih](https://github.com/KaelLuih)
- Email: kael_araujo@estudante.sesisenai.org.br

---

## 🙏 Agradecimentos

- Google Android Team pelas excelentes ferramentas
- JetBrains pelo Kotlin
- Material Design pela inspiração visual

---

⭐ Se este projeto foi útil, considere dar uma estrela!

Desenvolvido com ❤️ em Kotlin