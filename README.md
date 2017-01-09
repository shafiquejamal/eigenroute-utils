# Eigenroute Utils

This is a small library for including dependency injected time and id providers

## Installation

```
libraryDependencies += "com.eigenroute" %% "eigenroute-util" % "0.0.1"
```

## Use

```
class SomeController @Inject() (
    api: API,
    override val timeProvider: TimeProvider,
    override val jWTAlgorithmProvider: JWTAlgorithmProvider,
    override val jWTPublicKeyProvider: JWTPublicKeyProvider
  ) extends Controller with AuthenticatedActionCreator {

  def post = ???

}
```

Don't forget to bind the dependencies.