.class public final Lcom/daaw/jl2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/au6;


# instance fields
.field public final synthetic a:Lcom/daaw/zr6;


# direct methods
.method public constructor <init>(Lcom/daaw/ll2;Lcom/daaw/zr6;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/jl2;->a:Lcom/daaw/zr6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/jl2;->a:Lcom/daaw/zr6;

    invoke-virtual {v0, p1}, Lcom/daaw/zr6;->a(Ljava/io/File;)Z

    move-result p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
