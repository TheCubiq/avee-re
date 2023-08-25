.class public final synthetic Lcom/daaw/qe1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/avee/SplashActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/SplashActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qe1;->p:Lcom/daaw/avee/SplashActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qe1;->p:Lcom/daaw/avee/SplashActivity;

    invoke-static {v0}, Lcom/daaw/avee/SplashActivity;->T(Lcom/daaw/avee/SplashActivity;)V

    return-void
.end method
