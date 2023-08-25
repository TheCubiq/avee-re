.class public Lcom/daaw/tx0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tx0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/daaw/tx0$d;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final synthetic d:Lcom/daaw/tx0;


# direct methods
.method public constructor <init>(Lcom/daaw/tx0;Lcom/daaw/tx0$d;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tx0$a;->d:Lcom/daaw/tx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/tx0$a;->a:Lcom/daaw/tx0$d;

    iput-object p3, p0, Lcom/daaw/tx0$a;->b:Ljava/lang/Object;

    iput-object p4, p0, Lcom/daaw/tx0$a;->c:Ljava/lang/Object;

    return-void
.end method
