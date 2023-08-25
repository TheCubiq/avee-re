.class public final Lcom/daaw/qu0$b$c;
.super Lcom/daaw/qu0$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qu0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/qu0$b;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/qu0$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/qu0$b$c;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SUCCESS"

    return-object v0
.end method
