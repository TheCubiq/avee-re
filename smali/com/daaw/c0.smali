.class public final Lcom/daaw/c0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/c0$a;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/my2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lcom/daaw/c0$a;
    .locals 2

    new-instance v0, Lcom/daaw/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/c0$a;-><init>(Lcom/daaw/p32;)V

    return-object v0
.end method

.method public static bridge synthetic c(Lcom/daaw/c0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c0;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/c0;->a:Ljava/lang/String;

    return-object v0
.end method
