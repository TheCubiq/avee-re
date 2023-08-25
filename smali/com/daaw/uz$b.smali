.class public final Lcom/daaw/uz$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/uz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/bp0;

.field public final b:Lcom/daaw/nl1;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/daaw/bp0;Lcom/daaw/nl1;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uz$b;->a:Lcom/daaw/bp0;

    iput-object p2, p0, Lcom/daaw/uz$b;->b:Lcom/daaw/nl1;

    iput-object p3, p0, Lcom/daaw/uz$b;->c:Ljava/lang/Object;

    return-void
.end method
