.class public Lcom/daaw/m91;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static d:Lcom/daaw/m91;


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Lcom/daaw/sd0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/m91;

    invoke-direct {v0}, Lcom/daaw/m91;-><init>()V

    sput-object v0, Lcom/daaw/m91;->d:Lcom/daaw/m91;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/m91;->a:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/m91;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/m91;->c:Lcom/daaw/sd0;

    return-void
.end method
