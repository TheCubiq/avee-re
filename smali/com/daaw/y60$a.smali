.class public Lcom/daaw/y60$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ip;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/y60;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ip<",
        "Lcom/daaw/r60;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/r60;


# direct methods
.method public constructor <init>(Lcom/daaw/r60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y60$a;->a:Lcom/daaw/r60;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/daaw/dz0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/y60$a;->c(Lcom/daaw/dz0;)Lcom/daaw/r60;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Lcom/daaw/dz0;)Lcom/daaw/r60;
    .locals 0

    iget-object p1, p0, Lcom/daaw/y60$a;->a:Lcom/daaw/r60;

    return-object p1
.end method

.method public cancel()V
    .locals 0

    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y60$a;->a:Lcom/daaw/r60;

    invoke-virtual {v0}, Lcom/daaw/r60;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
