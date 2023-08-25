.class public Lcom/daaw/wn0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/wn0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wn0$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/wn0$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/wn0$a;->c:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/wn0$a;->d:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wn0$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/wn0$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/wn0$a;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/daaw/wn0$a;->d:Z

    return-void
.end method
