.class public final Lcom/daaw/zn$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/zn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/lang/Integer;

.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/zn;
    .locals 5

    new-instance v0, Lcom/daaw/zn;

    iget-object v1, p0, Lcom/daaw/zn$a;->a:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/daaw/zn$a;->b:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/daaw/zn$a;->c:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/daaw/zn$a;->d:Ljava/lang/Integer;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/zn;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v0
.end method
