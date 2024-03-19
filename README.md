# Bottom Navigation Animation

Este projeto demonstra como criar um indicador animado para BottomAppBar no Android usando Jetpack Compose.

## Descrição

O BottomAppBar é uma parte comum das interfaces de usuário em aplicativos Android, permitindo que os usuários alternem entre diferentes telas ou funcionalidades com facilidade. Este projeto apresenta uma implementação personalizável do indicador para realçar a seleção atual no BottomAppBarr, tornando a experiência do usuário mais dinâmica e atraente.

## Como Personalizar

Você pode personalizar o indicador e a animação da seguinte maneira:

1. **Indicador:**
    - O indicador é a linha horizontal que destaca a seleção atual na barra de navegação inferior.
    - Para personalizar o tamanho, cor ou forma do indicador, você pode ajustar as propriedades do `modifier` da `Box` no composable `BottomNavigationIndicator`.
    - O animateDpAsState altera o valor X do offset do indicator. Esse valor representa o deslocamento da view no eixo X, marcando a posição atual do indicador.
    - O indicator tem o seu tamanho calculado pegando a quantidade de item do BottomAppBar e dividindo pela largura da tela.
    - O Indicator é deslocado de acordo com a posição selecionada.

2. **Animação:**
    - A animação é aplicada ao valor DP de offset do indicador ao trocar de uma opção para outra na barra de navegação inferior.
    - Para personalizar a animação, como duração, interpolador ou comportamento de animação, você pode alterar os parâmetros no método `animateDpAsState` dentro de `BottomNavigationIndicator`.

## Pré-visualização

Aqui está uma pré-visualização do BottomAppBar Indicator:

![Pré-visualização]()

## Autor

Desenvolvido por [https://github.com/geanbrandao]

Se você encontrar algum problema ou tiver sugestões de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.

---
