.class public final synthetic Lcom/daaw/tw3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic p:Lcom/daaw/tw3;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/tw3;

    invoke-direct {v0}, Lcom/daaw/tw3;-><init>()V

    sput-object v0, Lcom/daaw/tw3;->p:Lcom/daaw/tw3;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    const-string v0, "Pinged SB successfully."

    invoke-static {v0}, Lcom/daaw/bx3;->a(Ljava/lang/String;)V

    return-void
.end method
