.class public final Lcom/daaw/t7$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lt0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/t7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/lt0<",
        "Lcom/daaw/ls0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/t7$f;

.field public static final b:Lcom/daaw/q00;

.field public static final c:Lcom/daaw/q00;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/t7$f;

    invoke-direct {v0}, Lcom/daaw/t7$f;-><init>()V

    sput-object v0, Lcom/daaw/t7$f;->a:Lcom/daaw/t7$f;

    const-string v0, "networkType"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/t7$f;->b:Lcom/daaw/q00;

    const-string v0, "mobileSubtype"

    invoke-static {v0}, Lcom/daaw/q00;->d(Ljava/lang/String;)Lcom/daaw/q00;

    move-result-object v0

    sput-object v0, Lcom/daaw/t7$f;->c:Lcom/daaw/q00;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/ls0;

    check-cast p2, Lcom/daaw/mt0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/t7$f;->b(Lcom/daaw/ls0;Lcom/daaw/mt0;)V

    return-void
.end method

.method public b(Lcom/daaw/ls0;Lcom/daaw/mt0;)V
    .locals 2

    sget-object v0, Lcom/daaw/t7$f;->b:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/ls0;->c()Lcom/daaw/ls0$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    sget-object v0, Lcom/daaw/t7$f;->c:Lcom/daaw/q00;

    invoke-virtual {p1}, Lcom/daaw/ls0;->b()Lcom/daaw/ls0$b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/daaw/mt0;->e(Lcom/daaw/q00;Ljava/lang/Object;)Lcom/daaw/mt0;

    return-void
.end method
