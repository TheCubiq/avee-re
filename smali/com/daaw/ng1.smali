.class public Lcom/daaw/ng1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ng1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/jp<",
        "Ljava/io/InputStream;",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# static fields
.field public static final r:Lcom/daaw/ng1$b;


# instance fields
.field public final p:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/zw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/zw<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ng1$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/ng1$b;-><init>(Lcom/daaw/ng1$a;)V

    sput-object v0, Lcom/daaw/ng1;->r:Lcom/daaw/ng1$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/u00;

    invoke-direct {v0}, Lcom/daaw/u00;-><init>()V

    iput-object v0, p0, Lcom/daaw/ng1;->p:Lcom/daaw/d51;

    new-instance v0, Lcom/daaw/mg1;

    invoke-direct {v0}, Lcom/daaw/mg1;-><init>()V

    iput-object v0, p0, Lcom/daaw/ng1;->q:Lcom/daaw/zw;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/zw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/zw<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ng1;->q:Lcom/daaw/zw;

    return-object v0
.end method

.method public c()Lcom/daaw/e51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/e51<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/jt0;->c()Lcom/daaw/jt0;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/daaw/ng1;->r:Lcom/daaw/ng1$b;

    return-object v0
.end method

.method public e()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ng1;->p:Lcom/daaw/d51;

    return-object v0
.end method
